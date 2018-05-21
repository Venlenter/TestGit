package model;

import com.sun.org.apache.bcel.internal.generic.GOTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.*;
import java.sql.*;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        Father[] fathers = new Father[3];
        System.out.println((fathers[0] == null));
        Object obj = new Object();
        Runtime.getRuntime().addShutdownHook(new Thread());
        Date today = new Date(123);
        Math.sqrt(2);



        /*Father f1 = new Father();
        f1.setName("小明");
        Father f2 = new Father();
        f2.setName("小白");
        swap(f1, f2);
        System.out.println("f1.name=" + f1.getName());
        System.out.println("f2.name=" + f2.getName());*/

        /*NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
        double x = 0.1;
        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));*/

        /*int[][] b = new int[1][2];
        for (int i = 0; i < b[0].length; i++) {
            b[0][i] = i;
        }
        System.out.println(Arrays.toString(b));*/

        /*testData:
        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 4; i1++) {
                if (i1%2 == 0) continue testData;
                else System.out.println(i  + " " +  i1);
            }
        }
        System.out.println("last");*/

       /* String x = "Ven1";
        switch (x) {
            case "Ten":
                System.out.println("Ten");
                break;
            case "Ven":
                System.out.println("Ven");
                break;
            default:
                System.out.println("default");
                break;
        }*/

        /*File file = new File("F:/myworkplace/IDEA/LeetcodeTest/src/a1_twosum.java");
        Scanner in = new Scanner(file);
        while (in.hasNext()) {
            System.out.println(in.next());
        }*/

        /*Scanner in = new Scanner(System.in);
        System.out.println("name: " + in.nextLine());
        System.out.println("firstName: " + in.next());
        System.out.println("double: " + in.nextDouble());*/

        //"Helololl".indexOf("lt");
        /*int day = EnumType.DayType.Fri.getType();
        for (EnumType.DayType dayType : EnumType.DayType.values()) {
            System.out.println(dayType);
        }*/
        /*int num = (1 & 0b1000) / 0b1000;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a1");
        arrayList.add("a2");
        System.out.println(arrayList.get(1));
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("l1");
        linkedList.add("l2");
        System.out.println(linkedList.get(1));*/


        /*for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        /*Father father = new Father();
        father.show();
        Son son1 = new Son();
        son1.show();
        son1.think();
        Father father2 = new Son();
        father2.show();*/
    }

    private static void swap(Father f1, Father f2) {
        f1.setName(f1.getName() + "改");
        f2.setName(f2.getName() + "改");
        /*Father temp = new Father();
        temp = f1;
        f1 = f2;
        f2 = temp;*/
    }
}
