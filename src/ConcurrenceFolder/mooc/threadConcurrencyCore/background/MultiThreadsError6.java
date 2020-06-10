package ConcurrenceFolder.mooc.threadConcurrencyCore.background;

import java.util.HashMap;
import java.util.Map;

/**
 * MultiThreadsError6
 *
 * @author venlenter
 * @Description: 构造函数中新建线程
 * @since unknown, 2020-05-14
 */
public class MultiThreadsError6 {
    private Map<String, String> states;
    public MultiThreadsError6() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                states = new HashMap<>();
                states.put("1", "周一");
                states.put("2", "周二");
                states.put("3", "周三");
                states.put("4", "周四");
            }
        }).start();
    }

    public Map<String, String> getStates() {
        return states;
    }

    public static void main(String[] args) {
        MultiThreadsError6 multiThreadsError6 = new MultiThreadsError6();
        //在构造函数中states还未初始化完成，就get
        System.out.println(multiThreadsError6.getStates().get("1"));
    }
}
