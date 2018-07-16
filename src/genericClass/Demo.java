package genericClass;

import interfaceClass.ArrayAlg;

import java.util.Collection;

public class Demo<T> {
    public static void main(String[] args) {
        Pair<String>[] table = new Pair[10];
        table[0] = new Pair<String>("hello", "World");
        System.out.println(table[0].getFirst() + table[0].getSecond());

        /*String[] words = {"Mary", "had", "a", "little", "lamb"};
        ArrayAlg.getMiddle("John", "Sam");
        System.out.println(ArrayAlg.getMiddle(3.14, 11, 0));*/

        //Pair<String> mm = ArrayAlg.minmax(words);
        /*Pair<String> pair = new Pair<>();
        pair.setFirst("First");
        pair.setSecond("Second");
        System.out.println(pair.getFirst() + pair.getSecond());*/

    }
    public <T> void test(Collection<T> collection) {
        collection.add((T)"12");
    }

}
