package ConcurrenceFolder;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicMain {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = new ThreadPoolExecutor(
//                0,
//                100,
//                0L,
//                TimeUnit.MILLISECONDS,
//                new LinkedBlockingQueue<Runnable>());

//        ExecutorService service = Executors.newCachedThreadPool();
//                Count count = new Count();
//        for (int i =0; i < 100; i++) {
//            service.execute(() -> count.increase());
//        }
//        service.shutdown();
//        service.awaitTermination(1, TimeUnit.DAYS);
//        System.out.println(count.getCount());

        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai);
        ai.getAndIncrement();
        System.out.println(ai);
    }
}

class Count {
    private Integer count = 0;

    public Integer getCount() {
        return count;
    }

    public synchronized void increase() {
        count++;
    }
}
