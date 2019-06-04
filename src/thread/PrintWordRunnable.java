package thread;

import static java.lang.Thread.sleep;

/**
 * Created By JianBin.Liu on 2019/6/4
 * Description:实现Runnable接口
 */
public class PrintWordRunnable implements Runnable {

    private String word;

    public PrintWordRunnable(String word){
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
        new Thread(new PrintWordRunnable("A")).start();
        new Thread(new PrintWordRunnable("B")).start();
    }
}
