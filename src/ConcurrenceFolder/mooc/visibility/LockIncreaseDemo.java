package ConcurrenceFolder.mooc.visibility;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * VolatileDemo
 *
 * @author venlenter
 * @Description:
 * @since unknown, 2020-03-17
 */
public class LockIncreaseDemo {
    private Lock lock = new ReentrantLock();
    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void increase() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.lock();
        try {
            number++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        LockIncreaseDemo volatileDemo = new LockIncreaseDemo();
        for (int i = 0; i < 500; i++) {
            new Thread(() -> volatileDemo.increase()).start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("number: " + volatileDemo.getNumber());
    }
}
