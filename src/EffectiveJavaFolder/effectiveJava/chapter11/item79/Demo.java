package EffectiveJavaFolder.effectiveJava.chapter11.item79;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo {
    public static void main(String[] args) {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
//        Executors.newCachedThreadPool();
        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("key", "value");

    }
}
