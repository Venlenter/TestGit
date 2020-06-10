package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.createThreads.wrongways;

/**
 * Lambda
 *
 * @author venlenter
 * @Description: 用lambda方式创建线程
 * @since unknown, 2020-03-29
 */
public class Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }
}
