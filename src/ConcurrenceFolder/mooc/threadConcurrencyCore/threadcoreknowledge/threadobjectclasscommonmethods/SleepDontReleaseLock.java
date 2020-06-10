package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.threadobjectclasscommonmethods;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * SleepDontReleaseLock
 *
 * @author venlenter
 * @Description: 演示sleep不释放lock（lock需要手动释放）
 * @since unknown, 2020-04-15
 */
public class SleepDontReleaseLock implements Runnable {
    private static final Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        System.out.println("线程" + Thread.currentThread().getName() + "获取到了lock");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("线程" + Thread.currentThread().getName() + "释放了lock");
    }

    public static void main(String[] args) {
        SleepDontReleaseLock sleepDontReleaseLock = new SleepDontReleaseLock();
        new Thread(sleepDontReleaseLock).start();
        new Thread(sleepDontReleaseLock).start();
    }
}
