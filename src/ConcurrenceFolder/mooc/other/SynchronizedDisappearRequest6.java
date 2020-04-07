package ConcurrenceFolder.mooc.other;

/**
 * SynchronizedDisappearRequest6
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description: synchronized解决消失的未读数
 * @since unknown, 2019-09-14
 */
public class SynchronizedDisappearRequest6 implements Runnable {
    static SynchronizedDisappearRequest6 instance = new SynchronizedDisappearRequest6();
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }

//    //对象锁-对普通方法加synchronized（同个对象实例）
//    @Override
//    public synchronized void run() {
//        for (int j = 0; j < 100000; j++) {
//            i++;
//        }
//    }

//    //对象锁-同步代码块（手动指定锁对象）
//    @Override
//    public void run() {
//        synchronized (this) {
//            for (int j = 0; j < 100000; j++) {
//                i++;
//            }
//        }
//    }

//        //类锁-*.class
//    @Override
//    public void run() {
//        synchronized (SynchronizedDisappearRequest6.class) {
//            for (int j = 0; j < 100000; j++) {
//                i++;
//            }
//        }
//    }

    //类锁-静态方法锁
    @Override
    public void run() {
        for (int j = 0; j < 100000; j++) {
            i++;
        }
    }

    //run方法override不支持扩展为static，不处理
}
