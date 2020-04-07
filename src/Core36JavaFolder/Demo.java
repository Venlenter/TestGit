package Core36JavaFolder;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * Demo
 *
 * @author <a href="mailto:kgzheng@coremail.cn">kgzheng</a>
 * @Description:
 * @since unknown, 2019-12-15
 */
public class Demo {
    public static void main(String[] args) {
        //test1();
        "123".getBytes();
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();

// Determine which strings are equivalent using the ==
// operator
        System.out.println("s1 == s2? " + (s1 == s2)); // false
        System.out.println("s1 == s3? " + (s1 == s3)); // true
    }

    private static void test1() {
        Object counter = new Object();
        ReferenceQueue refQueue = new ReferenceQueue();
        PhantomReference<Object> p = new PhantomReference<>(counter, refQueue);
        counter = null;
        System.gc();
        try {
            //Remove是一个阻塞方法，可以自定timeout，或者选择一直阻塞
            Reference<Object> ref = refQueue.remove(1000L);
            if (ref != null) {
                //
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void xx() throws Throwable {
        finalize();
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
    }
}
