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
public class MultiThreadsError implements Runnable {
    int index = 0;
    final boolean[] marked = new boolean[10000000];
    static AtomicInteger realIndex = new AtomicInteger();
    static AtomicInteger wrongCount = new AtomicInteger();
    static MultiThreadsError instance = new MultiThreadsError();

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            index++;
            realIndex.incrementAndGet();
            //如果2个线程都执行到if (marked[index]) {，A线程判断false，跳过if，当准备执行marked[index] = true;时，切换到了B线程
            //B线程判断也是marked[index]也是false，也跳过了if判断
            //所以最终结果就是少了
            if (marked[index]) {
                System.out.println("发生错误：" + index);
                wrongCount.incrementAndGet();
            }
            marked[index] = true;
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
