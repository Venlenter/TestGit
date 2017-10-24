package model;

import java.util.*;

public class ttt {
    public static void main(String[] args) {
        int x = 0;
        try {
            x =1;
        } catch (Exception e) {

        }
        System.out.println("try catch：" + x);

        List<String> list = new ArrayList<>();
        list.add("");
        list.add("1");
        list.add("2");
        System.out.println("List：");
        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("Set：");
        Set<String> set = new TreeSet<>();
        set.add("");
        set.add("1");
        set.add("2");
        set.add("1");
        for(String str2 : set) {
            System.out.println(str2);
        }

        System.out.println("Map：");
        Map<Integer,String> map = new HashMap<Integer ,String>();
        map.put(1, "1");
        map.put(1, "1");
        map.put(2, "2");
        for(int i : map.keySet()) {
            System.out.println(map.get(i));
        }

    }
}
