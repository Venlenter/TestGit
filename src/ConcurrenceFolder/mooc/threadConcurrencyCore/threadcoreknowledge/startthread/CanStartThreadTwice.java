package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.startthread;

/**
 * CanStartThreadTwice
 *
 * @author venlenter
 * @Description: 演示不能两次调用start方法，否则会报错
 * @since unknown, 2020-03-29
 */
public class CanStartThreadTwice {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
