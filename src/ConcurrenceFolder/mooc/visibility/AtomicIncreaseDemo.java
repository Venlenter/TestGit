package ConcurrenceFolder.mooc.visibility;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * VolatileDemo
 *
 * @author venlenter
 * @Description:
 * @since unknown, 2020-03-17
 */
public class AtomicIncreaseDemo {
    private AtomicInteger number = new AtomicInteger();

    public AtomicInteger getNumber() {
        return number;
    }

    public void increase() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number.getAndIncrement();
    }

    public static void main(String[] args) {
        AtomicIncreaseDemo volatileDemo = new AtomicIncreaseDemo();
        for (int i = 0; i < 500; i++) {
            new Thread(() -> volatileDemo.increase()).start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("number: " + volatileDemo.getNumber().get());
    }
}
