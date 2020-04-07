package ConcurrenceFolder.mooc.threadConcurrencyCore.startthread;

/**
 * StartAndRunMethod
 *
 * @author venlenter
 * @Description: 对比start和run两种启动线程的方法
 * @since unknown, 2020-03-29
 */
public class StartAndRunMethod {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        //直接runnable.run
        runnable.run();
        //通过start方法来间接执行run
        new Thread(runnable).start();
    }
}
