package ConcurrenceFolder.other;

/**
 * IncreaseSynchronizedTest
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description:
 * @since unknown, 2020-03-10
 */
public class IncreaseSynchronizedTest {
    public int inc = 0;
    public synchronized void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        final IncreaseSynchronizedTest test = new IncreaseSynchronizedTest();
        for (int i = 0; i < 5; i++) {
            new Thread() {
                @Override
                public void run() {
                    for (int j = 0; j < 100; j++) {
                        System.out.println(this.getName() + " run: j=" + j);
                        test.increase();
                    }
                }
            }.start();
        }
        Thread.sleep(5000);
        System.out.println("Last Result: " + test.inc);
    }
}
