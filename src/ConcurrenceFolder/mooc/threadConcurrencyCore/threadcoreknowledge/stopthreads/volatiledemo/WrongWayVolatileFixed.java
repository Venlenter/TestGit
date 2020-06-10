package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.stopthreads.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * WrongWayVolatileFixed
 *
 * @author venlenter
 * @Description: 使用interrupt方式正确处理生产者、消费者
 * @since unknown, 2020-04-05
 */
public class WrongWayVolatileFixed {
    public static void main(String[] args) throws InterruptedException {
        WrongWayVolatileFixed body = new WrongWayVolatileFixed();
        //生产者产生数据
        ArrayBlockingQueue storage = new ArrayBlockingQueue(10);
        Producer producer = body.new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(1000);

        //消费者消费数据
        Consumer consumer = body.new Consumer(storage);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(100);
        }
        System.out.println("消费者不需要更多数据了。");
        producerThread.interrupt();
    }

    /**
     * 生产者
     */
    class Producer implements Runnable {
        BlockingQueue storage;

        public Producer(BlockingQueue storage) {
            this.storage = storage;
        }

        @Override
        public void run() {
            int num = 0;
            try {
                while (num < 10000 && !Thread.currentThread().isInterrupted()) {
                    if (num % 100 == 0) {
                        storage.put(num);
                        System.out.println(num + "是100的倍数，被放到仓库中了。");
                    }
                    num++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("生产者结束运行");
            }
        }
    }

    /**
     * 消费者
     */
    class Consumer {
        BlockingQueue storage;

        public Consumer(BlockingQueue storage) {
            this.storage = storage;
        }

        public boolean needMoreNums() {
            return Math.random() > 0.95 ? false : true;
        }
    }
}



