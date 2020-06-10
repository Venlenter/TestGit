package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton6
 *
 * @author venlenter
 * @Description: 双重检查（推荐使用）
 * @since unknown, 2020-06-03
 */
public class Singleton6 {
    private volatile static Singleton6 instance;

    private Singleton6() {

    }

    public static Singleton6 getInstance() {
        if (instance == null) {
            synchronized (Singleton6.class) {
                if (instance == null) {
                    instance = new Singleton6();
                }
            }
        }
        return instance;
    }
}
