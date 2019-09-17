package EffectiveJavaFolder.effectiveJava.chapter11.item78;

import java.util.concurrent.TimeUnit;

public class StopThread {
    //使用volatile的方式
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested) {
                System.out.println(i++);
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }





//    //使用sync的方式
//    private static boolean stopRequested;
//
//    private static synchronized void requestStopRequest() {
//        stopRequested = true;
//    }
//
//    private static synchronized boolean stopRequested() {
//        return stopRequested;
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        Thread backgroundThread = new Thread(() -> {
//            int i = 0;
//            while (!stopRequested()) {
//                System.out.println(i++);
//            }
//        });
//        backgroundThread.start();
//        TimeUnit.SECONDS.sleep(1);
//        requestStopRequest();
//    }
}
