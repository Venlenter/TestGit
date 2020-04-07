package ConcurrenceFolder.mooc.other;

/**
 * SynchronizedOtherMethod11
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: 可重入粒度测试：调用类的其他方法
 * @since unknown, 2019-09-15
 */
public class SynchronizedOtherMethod11 {
    public synchronized void method1() {
        System.out.println("我是method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("我是method2");
    }

    public static void main(String[] args) {
        SynchronizedOtherMethod11 instance = new SynchronizedOtherMethod11();
        instance.method1();
    }
}
