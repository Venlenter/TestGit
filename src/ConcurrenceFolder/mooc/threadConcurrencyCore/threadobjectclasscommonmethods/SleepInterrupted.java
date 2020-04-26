package ConcurrenceFolder.mooc.threadConcurrencyCore.threadobjectclasscommonmethods;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * SleepInterrupted
 *
 * @author venlenter
 * @Description: 每隔1s输出当前时间，被中断，观察
 * Thread.sleep()
 * TimeUnit.SECONDS.sleep()
 * @since unknown, 2020-04-15
 */
public class SleepInterrupted implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("我被中断了");
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SleepInterrupted());
        thread.start();
        Thread.sleep(6500);
        thread.interrupt();
    }
}
