package EffectiveJavaFolder.effectiveJava.chapter2.item2;

import java.io.Serializable;

public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis() {}
    public static Elvis getInstance() {return INSTANCE;}
    public void leaveTheBuilding() {}
    private Object readResolve() {
        return INSTANCE;
    }

    public void test() {
    }
}
