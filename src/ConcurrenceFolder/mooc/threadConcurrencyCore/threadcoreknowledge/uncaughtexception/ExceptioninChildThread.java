package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.uncaughtexception;

/**
 * ExceptioninChildThread
 *
 * @author venlenter
 * @Description: 单线程，抛出，处理，有异常堆栈
 * 多线程，子线程发生异常，会有什么不同？
 * @since unknown, 2020-04-28
 */
public class ExceptioninChildThread implements Runnable{
    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        new Thread(new ExceptioninChildThread()).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
