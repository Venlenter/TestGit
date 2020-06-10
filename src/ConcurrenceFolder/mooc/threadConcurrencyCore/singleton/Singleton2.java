package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton2
 *
 * @author venlenter
 * @Description: 饿汉式（静态代码块）（可用）
 * @since unknown, 2020-06-02
 */
public class Singleton2 {
    //类加载时就完成了初始化
    private final static Singleton2 INSTANCE;
    static {
        INSTANCE = new Singleton2();
    }
    private Singleton2() {

    }
    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
