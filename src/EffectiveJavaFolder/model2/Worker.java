package EffectiveJavaFolder.model2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Worker {
    public void fix(Tools tool){
        System.out.println("工人" + tool.function());
    }


    public static void main(String[] args) {

        test();
        printDate();

        /*new Worker().fix(new Hammer());
        new Worker().fix(new Screwdriver());
*/

    }

    private static void test() {
        String hello = "hello";
        test(hello);
        test(hello);
        test(hello);
        test("world");
        test("world");
    }

    private static void printDate() {
        System.out.println(new Date());
        List<String> list = new ArrayList<>();
        for (String s : list) System.out.println(s);
        String name = "zhagnsan";
        int age = 10;
    }

    private static void test(String hello) {
        System.out.println(hello);
    }
}
