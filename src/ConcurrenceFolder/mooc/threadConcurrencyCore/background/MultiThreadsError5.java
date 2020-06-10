package ConcurrenceFolder.mooc.threadConcurrencyCore.background;

/**
 * MultiThreadsError5
 *
 * @author venlenter
 * @Description: 观察者模式
 * @since unknown, 2020-05-12
 */
public class MultiThreadsError5 {
    int count;

    public MultiThreadsError5(MySource source) {
        source.registerListener(new EventListener() {
            @Override
            //这里EventListener是一个匿名内部类，实际上也用了count这个外部引用变量，当count未初始化完成，拿到的值就还是0
            public void onEvent(Event e) {
                System.out.println("\n我得到的数字是：" + count);
            }
        });
        for (int i = 0; i < 10000; i++) {
            System.out.print(i);
        }
        count = 100;
    }

    public static void main(String[] args) {
        MySource mySource = new MySource();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mySource.eventCome(new Event() {
                });
            }
        }).start();
        MultiThreadsError5 multiThreadsError5 = new MultiThreadsError5(mySource);
    }

    static class MySource {
        private EventListener listener;

        void registerListener(EventListener eventListener) {
            this.listener = eventListener;
        }

        void eventCome(Event e) {
            if (listener != null) {
                listener.onEvent(e);
            } else {
                System.out.println("还未初始化完毕");
            }
        }
    }

    interface EventListener {
        void onEvent(Event e);
    }

    interface Event {

    }
}
