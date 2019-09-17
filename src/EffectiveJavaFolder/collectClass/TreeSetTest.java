package EffectiveJavaFolder.collectClass;

import java.util.*;
import java.util.stream.Collectors;

public class TreeSetTest {
    public static void main(String[] args) throws InterruptedException {
        Arrays.asList("Amy", "Bob");
        Thread thread = Thread.currentThread();
        thread.interrupt();
        thread.isInterrupted();
        thread.join();
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.setDaemon(true);

//        List<String> lines = Arrays.asList("B", "A", "C", "D", "Q");
//        List<String> list = lines.stream().filter(l -> {
//            if (l.equals("C") || l.equals("D")) return true;
//            return false;
//        }).map(String::toLowerCase).collect(Collectors.toList());
//        System.out.println(list);

//        HashSet<String> set = new HashSet<>();
//        set.add("b1");
//        set.add("a1");
//        set.add("c1");
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        Map<String,String> map = new HashMap<>();
//        map.put("b1", "boy");
//        map.put("a1", "apple");
//        map.put("c1", "cat");
//        map.get("a1");
//
//        List<String> list = new ArrayList<>();
//        list.add("b1");
//        list.add("a1");
//        list.add(2,"c1");
//        list.get(2);
//        list.remove(1);
//        List<Integer> integers = new ArrayList<>();
//        integers.add(2);
//        integers.remove(new Integer(1));
//
//
//        Map<String, String> map =  new LinkedHashMap<>();
//        map.put("b1", "b2");
//        map.put("a1", "a2");
//        map.put("c1", "c2");
////        for (String key : map.keySet()) {
////            System.out.println("key:" + key + ", value:" + map.get(key));
////        }
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            System.out.println("key:" + entry.getKey() + ", value:" + entry.getValue());
//        }
//
//
//        SortedSet<Item> parts = new TreeSet<>();
//        parts.add(new Item("Toaster", 1234));
//        parts.add(new Item("Widget", 4562));
//        parts.add(new Item("Modem", 9912));
//        System.out.println(parts);
//
//        SortedSet<Item> sortByDescription = new TreeSet<>(
//                new Comparator<Item>() {
//                    @Override
//                    public int compare(Item o1, Item o2) {
////                        String descrA = o1.getPartNumber() + "";
////                        String descrB = o2.getPartNumber() + "";
//                        String descrA = o1.getDescription();
//                        String descrB = o2.getDescription();
//                        return descrA.compareTo(descrB);
//                    }
//                });
//        sortByDescription.addAll(parts);
//        System.out.println(sortByDescription);
    }
}
