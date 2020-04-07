package ConcurrenceFolder.other;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * IncreaseLockTest
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description:
 * @since unknown, 2020-03-10
 */
public class IncreaseLockTest {
    public int inc = 0;
    Lock lock = new ReentrantLock();
    public void increase() {
        lock.lock();
        try {
            inc++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final IncreaseLockTest test = new IncreaseLockTest();
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 1000; j++) {
                        System.out.println(this.getName() + " run: j=" + j);
                        test.increase();
                    }
                }
            }.start();
        }
        Thread.sleep(5000);
        System.out.println(test.inc);
    }
}
