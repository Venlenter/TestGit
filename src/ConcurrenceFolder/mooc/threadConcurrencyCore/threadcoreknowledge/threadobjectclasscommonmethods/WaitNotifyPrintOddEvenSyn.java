package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * WaitNotifyPrintOddEvenSyn
 *
 * @author venlenter
 * @Description: 两个线程交替打印0~100的奇偶数，用synchronized关键字实现
 * @since unknown, 2020-04-12
 */
public class WaitNotifyPrintOddEvenSyn {
    public static int count = 0;
    public static final Object lock = new Object();

    //新建2个线程
    //1个只处理偶数，第二个只处理奇数（用位运算）
    //用synchronized来通信
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (lock) {
                        if ((count & 1) == 0) {
                            System.out.println((Thread.currentThread().getName() + ":" + count++));
                        }
                    }
                }
            }
        }, "偶数").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (count < 100) {
                    synchronized (lock) {
                        if ((count & 1) == 1) {
                            System.out.println(Thread.currentThread().getName() + ":" + count++);
                        }
                    }
                }
            }
        }, "奇数").start();
    }
}
