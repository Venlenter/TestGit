package EffectiveJavaFolder.collectClass;

import EffectiveJavaFolder.commonClass.Item;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Item> pq = new PriorityQueue<>();
        pq.add(new Item("Bob", 200));
        pq.add(new Item("Amy", 100));
        pq.add(new Item("Candy", 300));

        System.out.println("Iterating over elements");
        for (Item item : pq) {
            System.out.println(item.getDescription());
        }
        System.out.println("Removing elements");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().getDescription());
        }
    }
}
