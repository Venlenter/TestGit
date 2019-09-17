package EffectiveJavaFolder.model;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int N = scanner.nextInt();
            int size = (int)Math.sqrt((double) N);
            for(int a=0; a<=size; a++) {
                for(int b=0; b<=size; b++) {
                    if(Math.pow(a, 2) + Math.pow(b, 2) == N) System.out.println("true：" + a + " "+  b);
                }
            }
            System.out.println("-------------------------------------");
        }

    }
}
