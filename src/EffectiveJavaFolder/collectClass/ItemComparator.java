package EffectiveJavaFolder.collectClass;

import EffectiveJavaFolder.commonClass.Manager;

import java.util.Comparator;

public class ItemComparator implements Comparator<Manager> {
    @Override
    public int compare(Manager o1, Manager o2) {
        return Double.compare(o1.getBonus(), o2.getBonus());
    }
}
