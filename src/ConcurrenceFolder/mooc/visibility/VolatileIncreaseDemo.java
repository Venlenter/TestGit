package ConcurrenceFolder.mooc.visibility;

/**
 * VolatileDemo
 *
 * @author venlenter
 * @Description:
 * @since unknown, 2020-03-17
 */
public class VolatileIncreaseDemo {
    private volatile int number = 0;

    public int getNumber() {
        return number;
    }

    public void increase() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        number++;
    }

    public static void main(String[] args) {
        VolatileIncreaseDemo volatileDemo = new VolatileIncreaseDemo();
        for (int i = 0; i < 500; i++) {
            new Thread(() -> volatileDemo.increase()).start();
        }
        while (Thread.activeCount() > 2) {
            Thread.yield();
        }
        System.out.println("number: " + volatileDemo.getNumber());
    }
}
