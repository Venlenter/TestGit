package EffectiveJavaFolder.aSync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {
    private ExecutorService executor = Executors.newCachedThreadPool();
    public void fun() throws Exception{
        executor.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    //要自行的业务代码
                    Thread.sleep(5000);
                    System.out.println("睡够了");
                } catch (Exception e) {
                    throw new RuntimeException("报错了!!");
                }
            }
        });
    }
}
