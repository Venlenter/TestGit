package EffectiveJavaFolder.threadClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);
        try {
            blockingQueue.put("A");
            blockingQueue.put("B");
            blockingQueue.put("C");
            blockingQueue.put("D");
            blockingQueue.put("E");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {
            String element = blockingQueue.peek();
            if (element == null) {
                break;
            }
            System.out.println(element);
            if (Arrays.asList("A", "B", "C").contains(element)) {
                blockingQueue.poll();
            }
        }
    }
}
