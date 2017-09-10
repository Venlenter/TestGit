package model;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args){

        ArrayList<String> strList = new ArrayList<>();
        strList.add("ven");
        System.out.println(strList.get(0));
    }

    public void xx(){
        ArrayList<Song> songList = new ArrayList<>();
        takeThing(songList);
    }

    public <T extends Song> void takeThing(ArrayList<T> list) {

    }


}
