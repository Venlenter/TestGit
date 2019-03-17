package collectClass;

import commonClass.Manager;

import java.security.AlgorithmConstraints;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("111");
        List<String> synchronizedList = Collections.synchronizedList(arrayList);
        synchronizedList.add("aaa");
        synchronizedList.add("bbb");
        for (int i = 0; i < synchronizedList.size(); i++) {
            System.out.println(synchronizedList.get(i));
        }

//        SortedSet<String> sorter = new TreeSet<>();
//        sorter.add("Bob");
//        sorter.add("Amy");
//        sorter.add("Carl");
//        sorter.forEach(s -> System.out.println(s));
//        ItemComparator comp = new ItemComparator();
//        SortedSet<Manager> sortByBonus = new TreeSet<>(comp);

        //SetTest
//        Set<String> words = new HashSet<>();
//        long totalTime = 0;
//        Scanner in = new Scanner(System.in);
//        int y = 0;
//        while (in.hasNext() && y < 6) {
//            String word = in.next();
//            long callTime = System.currentTimeMillis();
//            words.add(word);
//            callTime = System.currentTimeMillis() - callTime;
//            totalTime += callTime;
//            y++;
//        }
//
//        Iterator<String> iter = words.iterator();
//        for (int i = 1; i <= 20 && iter.hasNext(); i++) {
//            System.out.println(iter.next());
//        }
//        System.out.println("...");
//        System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");

//        List<String> a = new LinkedList<>();
//        a.add("Amy");
//        a.add("Carl");
//        a.add("Erica");
//
//        List<String> b = new LinkedList<>();
//        b.add("Bob");
//        b.add("Doug");
//        b.add("Frances");
//        b.add("Gloria");
//
//        ListIterator<String> aIter = a.listIterator();
//        Iterator<String> bIter = b.iterator();
//        ((LinkedList<String>) a).addFirst("First");
//        ((LinkedList<String>) a).addLast("Last");
//        System.out.println(a);

//        while (bIter.hasNext()) {
//            if (aIter.hasNext()) {
//                aIter.next();
//            }
//            aIter.add(bIter.next());
//        }
//        System.out.println(a);
//
//        bIter = b.iterator();
//        while (bIter.hasNext()) {
//            bIter.next();
//            if (bIter.hasNext()) {
//                bIter.next();
//                bIter.remove();
//            }
//        }
//        System.out.println(b);
//        a.removeAll(b);
//        System.out.println(a);

//        List<String> staff = new LinkedList<>();
//        staff.add("hello");
//        ListIterator<String> iter = staff.listIterator();
//        iter.add("world");

//        Queue<Manager> expressLane = new CircularArrayQueue<>(100);
//        expressLane.add(new Manager("Name", 100, new Date()));
//        List<String> stringList = new ArrayList<>();
//        stringList.add("hello");
//        stringList.add("world");
//        Iterator<String> iterator = stringList.iterator();
//        iterator.next();
//        iterator.remove();
//        System.out.println(iterator.next());
//        while(iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        iterator.next();
    }
}
