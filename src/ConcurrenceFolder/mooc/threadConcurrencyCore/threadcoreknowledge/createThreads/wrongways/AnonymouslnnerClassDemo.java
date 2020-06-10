package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.createThreads.wrongways;

/**
 * AnonymouslnnerClassDemo
 *
 * @author venlenter
 * @Description: 匿名内部类创建线程
 * @since unknown, 2020-03-29
 */
public class AnonymouslnnerClassDemo {
    public static void main(String[] args) {
        //方式1，直接new Thread重写run方法
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();
        //方式2，传入一个Runnable()
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
