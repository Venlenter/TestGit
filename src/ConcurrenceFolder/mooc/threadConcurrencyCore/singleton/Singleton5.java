package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton5
 *
 * @author venlenter
 * @Description: 懒汉式（线程不安全，同步代码块）（不可用）
 * @since unknown, 2020-06-03
 */
public class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {

    }

    public static Singleton5 getInstance() {
        //2个线程同时进入这里，则A线程synchronized执行完后，B线程又执行一次synchronized初始化
        //本质还是执行了2次初始化，线程不安全
        if (instance == null) {
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }
        return instance;
    }
}
