package ConcurrenceFolder.mooc;

/**
 * SynchronizedSuperClass12
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: 可重入粒度测试，调用父类的方法
 * @since unknown, 2019-09-15
 */
public class SynchronizedSuperClass12 {
    public synchronized void doSomeThing() {
        System.out.println("我是父类方法");
    }
}

class TestClass extends SynchronizedSuperClass12 {
    @Override
    public synchronized void doSomeThing() {
        System.out.println("我是子类方法");
        super.doSomeThing();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.doSomeThing();
    }
}
