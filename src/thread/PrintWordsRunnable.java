package thread;

/**
 * Created By JianBin.Liu on 2019/6/4
 * Description: 用多线程同步实现ABCABCABCABCABCABC...循环10次输出
 */
public class PrintWordsRunnable implements Runnable{

    private Object pre;
    private Object self;
    private String name;

    public PrintWordsRunnable(Object pre, Object self, String name){
        this.name = name;
        this.self = self;
        this.pre = pre;
    }
    //需要3个线程，分别打印A,B,C
    //需要锁，在打印A的时候，B不能打印，要等A唤醒，打印C的时候
    //A打印的时候，获取A的锁和C的锁，B打印的时候获取A的锁和B的锁，C打印的时候获取B的锁和C的锁才可以打印....

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            synchronized (pre){
                synchronized (self){
                    System.out.print(name);
                    self.notify();
                }
                try {
                    pre.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String arg[]) throws Exception{
            Object a = new Object();
            Object b = new Object();
            Object c = new Object();
            Thread pa = new Thread(new PrintWordsRunnable(c, a, "A"));
            Thread pb = new Thread(new PrintWordsRunnable(a, b, "B"));
            Thread pc = new Thread(new PrintWordsRunnable(b, c, "C"));
            //保证顺序
            pa.start();
            Thread.sleep(1000);
            pb.start();
            Thread.sleep(1000);
            pc.start();

    }
}
