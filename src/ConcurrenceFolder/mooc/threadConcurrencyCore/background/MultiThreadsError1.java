package ConcurrenceFolder.mooc.threadConcurrencyCore.background;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * MultiThreadsError
 *
 * @author venlenter
 * @Description: 第一种：运行结果出错
 * 演示计数不准确（减少），找出具体出错的位置
 * @since unknown, 2020-05-07
 */
public class MultiThreadsError1 implements Runnable {
    int index = 0;
    final boolean[] marked = new boolean[10000000];
    static AtomicInteger realIndex = new AtomicInteger();
    static AtomicInteger wrongCount = new AtomicInteger();
    static MultiThreadsError1 instance = new MultiThreadsError1();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + " index=" + index);
            index++;
            realIndex.incrementAndGet();
            //在原基础上加synchronized
            synchronized (instance) {
                System.out.println(Thread.currentThread().getName() + " synchronized,index[" + index + "],marked[index]:" + marked[index]);
                if (marked[index]) {
                    System.out.println(Thread.currentThread().getName() + "发生错误：" + index);
                    wrongCount.incrementAndGet();
                }
                marked[index] = true;
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(instance);
        Thread thread2 = new Thread(instance);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("表面上结果是：" + instance.index);
        System.out.println("真正运行的次数：" + realIndex.get());
        System.out.println("错误次数：" + wrongCount.get());
    }
}
