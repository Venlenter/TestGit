package ConcurrenceFolder.mooc.threadConcurrencyCore.threadobjectclasscommonmethods;

/**
 * CurrentThread
 *
 * @author venlenter
 * @Description: 演示打印majn, Thread-0, Thread-1
 * @since unknown, 2020-04-22
 */
public class CurrentThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new CurrentThread().run();
        new Thread(new CurrentThread()).start();
        new Thread(new CurrentThread()).start();
    }
}
