package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.sixstates;

/**
 * test2
 *
 * @author venlenter
 * @Description: TODO
 * @since unknown, 2020-04-09
 */
public class test2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.increase();
            }
        }, "t1线程");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                c.increase();
            }
        }, "t2线程");
        t2.start();

        Thread.sleep(100); // 确保 t2 run已经得到执行
        System.out.println(t2.getState());
    }
}

class Counter {
    int counter;

    public synchronized void increase() {
        counter++;
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
