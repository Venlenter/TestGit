package ConcurrenceFolder.mooc.threadConcurrencyCore.threadobjectclasscommonmethods;

/**
 * WaitNotifyPrintOddEvenWait
 *
 * @author venlenter
 * @Description: 两个线程交替打印0~100的奇偶数，用wait和notify
 * @since unknown, 2020-04-12
 */
public class WaitNotifyPrintOddEvenWait {
    private static int count = 0;
    private static Object lock = new Object();
    //1. 拿到锁，我们就打印
    //2. 打印完，唤醒其他线程，自己就休眠
    static class TurningRunner implements Runnable {
        @Override
        public void run() {
            while (count <= 100) {
                synchronized (lock) {
                    //拿到锁就打印
                    System.out.println(Thread.currentThread().getName() + ":" + count++);
                    lock.notify();
                    if (count <= 100) {
                        try {
                            //如果任务还没结束，就让出当前线程，并休眠
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new TurningRunner(),"偶数").start();
        Thread.sleep(100);
        new Thread(new TurningRunner(),"奇数").start();
    }
}
