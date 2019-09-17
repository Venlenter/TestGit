package EffectiveJavaFolder.exceptionClass;

import java.util.ArrayList;
import java.util.List;

public class exceptionDemo {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList<Integer>();
        list.add(1,"");
        throw new Exception("回滚");
    }
}
