package ConcurrenceFolder.mooc;

/**
 * SynchronizedRecursion10
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: 可重入粒度测试：递归调用本方法
 * @since unknown, 2019-09-15
 */
public class SynchronizedRecursion10 {
    int a = 0;

    public static void main(String[] args) {
        SynchronizedRecursion10 instance = new SynchronizedRecursion10();
        instance.method1();
    }

    private synchronized void method1() {
        System.out.println("这是method1，a = " + a);
        if (a == 0) {
            a++;
            method1();
        }

    }
}
