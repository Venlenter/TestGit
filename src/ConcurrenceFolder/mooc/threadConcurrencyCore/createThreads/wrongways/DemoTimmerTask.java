package ConcurrenceFolder.mooc.threadConcurrencyCore.createThreads.wrongways;

import java.util.Timer;
import java.util.TimerTask;

/**
 * DemoTimmerTask
 *
 * @author venlenter
 * @Description: 定时器创建线程，定时1s打印当前线程名
 * @since unknown, 2020-03-29
 */
public class DemoTimmerTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 1000, 1000);
    }
}
