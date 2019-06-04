package thread;

/**
 * Created By JianBin.Liu on 2019/6/4
 * Description: 继承thread类。
 */
public class PrintWordThread extends Thread {

    private String word;

    public PrintWordThread(String word){
        this.word = word;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i ++){
            try {
                sleep(1000*2);
            }catch (Exception e){

            }
            System.out.println(word);
        }
    }

    public static void main(String ages[]){
        PrintWordThread thread1 = new PrintWordThread("A");
        PrintWordThread thread2 = new PrintWordThread("B");
        thread1.start();//线程转化为就绪状态，等待CPU执行
        thread2.start();
    }
}
