package EffectiveJavaFolder.effectiveJava.chapter3;

import java.util.Map;

public class cloneModel implements Cloneable{
    protected Map<String, String> map;
    private String name;

    public cloneModel(Map<String, String> map, String name) {
        this.map = map;
        this.name = name;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
