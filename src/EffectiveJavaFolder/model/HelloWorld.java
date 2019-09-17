package EffectiveJavaFolder.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class HelloWorld {
    public static void main(String[] args){
        //Tvariant/Tstruct/
        HashMap<String, String> tstruct = new HashMap<>(20);
        HashMap<Integer, String> t1 = new HashMap<>();
        tstruct.put("a2", "ven02");
        tstruct.put("a1", "ven01");
        tstruct.put("a3", "ven03");
        System.out.println(tstruct.containsKey("a1"));
        System.out.println(tstruct.containsValue("ven02"));
        t1.isEmpty();
        tstruct.size();
        tstruct.replace("a1", "newVen01");
        tstruct.keySet();
        tstruct.values();
        tstruct.entrySet();
        tstruct.get("a1");
        tstruct.get("a");
        tstruct.remove("a3");
        tstruct.clear();
        Hashtable<String, String> table = new Hashtable<>(tstruct);

        /*
        ArrayList<String> strList = new ArrayList<>();
        strList.add("ven");
        System.out.println(strList.get(0));
        */
    }

    public void xx(){
        ArrayList<Song> songList = new ArrayList<>();
        takeThing(songList);
    }

    public <T extends Song> void takeThing(ArrayList<T> list) {

    }


}
