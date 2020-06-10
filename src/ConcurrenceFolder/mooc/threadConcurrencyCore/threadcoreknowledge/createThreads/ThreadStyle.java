package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.createThreads;

/**
 * ThreadStyle
 *
 * @author venlenter
 * @Description: 用Thread方法实现线程
 * @since unknown, 2020-03-23
 */
public class ThreadStyle extends Thread {
    @Override
    public void run() {
        System.out.println("用Thread方法实现线程");
    }

    public static void main(String[] args) {
        Thread thread = new ThreadStyle();
        thread.start();
    }
}
