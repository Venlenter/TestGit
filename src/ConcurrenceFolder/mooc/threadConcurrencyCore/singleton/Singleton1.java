package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton1
 *
 * @author venlenter
 * @Description: 饿汉式（静态常量）（可用）
 * @since unknown, 2020-06-02
 */
public class Singleton1 {
    //类加载时就完成了初始化
    private final static Singleton1 INSTANCE = new Singleton1();
    private Singleton1() {

    }
    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
