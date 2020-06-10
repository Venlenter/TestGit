package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.stopthreads;

/**
 * CanInterrupt
 *
 * @author venlenter
 * @Description: 在while中使用try catch
 * @since unknown, 2020-04-05
 */
public class CanInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num = 0;
            while (num <=10000 && !Thread.currentThread().isInterrupted()) {
                if (num % 100 == 0) {
                    System.out.println(num + "是100的倍数");
                }
                num++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread.sleep(5000);
        thread.interrupt();
    }
}
