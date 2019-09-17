package ConcurrenceFolder.mooc;

/**
 * SynchronizedYesAndNo6
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: 同时访问【同步】方法与【非同步】方法
 * @since unknown, 2019-09-14
 */
public class SynchronizedYesAndNo6 implements Runnable{
    static SynchronizedYesAndNo6 instance = new SynchronizedYesAndNo6();

    @Override
    public void run() {
        if ("Thread-0".equals(Thread.currentThread().getName())) {
            method1();
        } else {
            method2();
        }
    }

    public synchronized void method1() {
        System.out.println("我是加锁的方法，我叫 " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public void method2() {
        System.out.println("我是不加锁的方法，我叫 " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while(t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("finished");
    }
}
