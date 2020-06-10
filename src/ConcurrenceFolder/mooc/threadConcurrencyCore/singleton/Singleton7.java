package ConcurrenceFolder.mooc.threadConcurrencyCore.singleton;

/**
 * Singleton7
 *
 * @author venlenter
 * @Description: 静态内部类方式，可用
 * @since unknown, 2020-06-03
 */
public class Singleton7 {

    private Singleton7() {

    }
    //JVM加载Singleton7类的时候，不会初始化内部类变量，达到了懒加载
    private static class SingletonInstance {
        private static final Singleton7 instance = new Singleton7();
    }

    public static Singleton7 getInstance() {
        //只有当调用到的是，才会进行加载
        return SingletonInstance.instance;

    }
}
