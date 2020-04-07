package ConcurrenceFolder.other;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * IncreaseAtomicIntegerTest
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description:
 * @since unknown, 2020-03-10
 */
public class IncreaseAtomicIntegerTest {
    public AtomicInteger inc = new AtomicInteger();
    public void increase() {
        inc.getAndIncrement();
    }
    public static void main(String[] args) throws InterruptedException {
        final IncreaseAtomicIntegerTest test = new IncreaseAtomicIntegerTest();
        for (int i = 0; i < 10; i++) {
            new Thread()  {
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
