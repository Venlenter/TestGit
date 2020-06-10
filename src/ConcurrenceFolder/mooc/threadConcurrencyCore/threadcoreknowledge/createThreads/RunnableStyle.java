package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.createThreads;

/**
 * RunnableStyle
 *
 * @author venlenter
 * @Description: 用Runnable方式创建线程
 * @since unknown, 2020-03-23
 */
public class RunnableStyle implements Runnable {
    @Override
    public void run() {
        System.out.println("用Runnable方法实现线程");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableStyle());
        thread.start();
    }
}
