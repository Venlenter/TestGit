package EffectiveJavaFolder.effectiveJava.chapter3;

import EffectiveJavaFolder.commonClass.Item;
import EffectiveJavaFolder.extendClass.Student;

import java.awt.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.List;


public class Demo implements Cloneable{
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        cloneModel model = new cloneModel(map, "小明");
        Class<cloneModel> cloneModelClass = cloneModel.class;
        Field filed = cloneModelClass.getDeclaredField("name");
        filed.setAccessible(true);
        Object name = filed.get(model);
        System.out.println(name);

//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        List<String> modifList = Collections.unmodifiableList(list);
//        modifList.add("3");

//        Map<Student, String> map = new HashMap<>();
//        map.put(new Student("name", "major"), "1");
//        System.out.println(map.get(new Student("name", "major")));
//        new Student("", "");
//        List<String> list = new ArrayList<>();
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });
//        Map<String, String> map2 = new cloneModel(null, "").map;

//        List<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(1);
//        list.add(2);
//        list.stream().forEach(l -> System.out.println(l));
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
//        System.out.println("________________________");
//        list.stream().forEach(l -> System.out.println(l));
    }
    private static final Comparator<Item> COMPARATOR =
            Comparator.comparingInt((Item item) -> item.getPartNumber())
            .thenComparingInt(item -> item.getPartNumber())
            .thenComparingInt(item -> item.getPartNumber());

    private static final Student[] PRIVATE_VALUES = {};
    public static final List<Student> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
