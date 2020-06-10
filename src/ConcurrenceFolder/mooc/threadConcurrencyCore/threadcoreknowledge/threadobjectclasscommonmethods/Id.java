package ConcurrenceFolder.mooc.threadConcurrencyCore.threadcoreknowledge.threadobjectclasscommonmethods;

/**
 * Id
 *
 * @author venlenter
 * @Description: ID从1开始，JVM运行起来后，我们自己创建的线程的ID早已不是2
 * @since unknown, 2020-04-26
 */
public class Id {
    public static void main(String[] args) {
        Thread thread = new Thread();
        //thread.getId = nextThreadID()
        //private static synchronized long nextThreadID() {
        //        return ++threadSeqNumber;
        //    }
        System.out.println("主线程id：" + Thread.currentThread().getId());
        System.out.println("子线程id：" + thread.getId());
        System.out.println("子线程初始名字：" + thread.getName());
        thread.setName("FlyThread-1");
        System.out.println("子线程修改后的名字：" + thread.getName());
        thread.setDaemon(true);
    }
}
