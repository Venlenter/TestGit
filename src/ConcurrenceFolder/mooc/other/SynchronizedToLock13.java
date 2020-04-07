package ConcurrenceFolder.mooc.other;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * SynchronizedToLock13
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: synchronized和Lock等价
 * @since unknown, 2019-09-16
 */
public class SynchronizedToLock13 {
    Lock lock = new ReentrantLock();
    public synchronized void method1() {
        System.out.println("我是Synchronized形式的锁");
    }

    public void method2() {
        lock.lock();
        try {
            System.out.println("我是lock形式的锁");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SynchronizedToLock13 instance = new SynchronizedToLock13();
        instance.method1();
        instance.method2();
    }
}
