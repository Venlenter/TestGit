package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton4
 *
 * @author venlenter
 * @Description: 懒汉式（线程安全）（不推荐）
 * @since unknown, 2020-06-03
 */
public class Singleton4 {
    private static Singleton4 instance;

    private Singleton4() {

    }

    //synchronized，多个线程执行会阻塞等待
    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }
}
