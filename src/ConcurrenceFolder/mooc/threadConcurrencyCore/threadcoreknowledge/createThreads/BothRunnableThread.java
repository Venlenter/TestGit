package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.createThreads;

/**
 * BothRunnableThread
 *
 * @author venlenter
 * @Description: 同时使用Runnable和Thread
 * @since unknown, 2020-03-23
 */
public class BothRunnableThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我来自Runnable");
            }
        }) {
            @Override
            public void run() {
                System.out.println("我来自Thread");
            }
        }.start();
    }
}
