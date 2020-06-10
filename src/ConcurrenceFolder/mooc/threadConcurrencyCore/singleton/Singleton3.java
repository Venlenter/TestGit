package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton3
 *
 * @author venlenter
 * @Description: 懒汉式（线程不安全）
 * @since unknown, 2020-06-03
 */
public class Singleton3 {
    private static Singleton3 instance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        //如果2个线程同时执行到这一行，则会执行2次new Singleton3()，创建了多个实例
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
