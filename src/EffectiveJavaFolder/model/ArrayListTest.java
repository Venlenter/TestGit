package EffectiveJavaFolder.model;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<String>();
        TreeSet<String> list = new TreeSet<>();
        Set<String> ll = new TreeSet<>();
        list.add("Brany");
        list.add("Jane");
        list.add("Amy");
        for (String lt : list) {
            System.out.print(lt + " ");
        }
        System.out.println();

        /*
        HashMap map = new HashMap();
        map.put("t0", list.get(0));
        map.put("t1", list.get(1));
        map.put("t2", list.get(2));
        for (int i=0; i<map.size(); i++) {
            System.out.println(map.get("t" + i));
        }
        */
    }
}
