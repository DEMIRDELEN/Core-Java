package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_Odev {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("a");
        harfler.add("D");
        harfler.add("F");
        harfler.add("C");

        System.out.println(harfler);

        Collections.sort(harfler);

        System.out.println(harfler);

        harfler.add("G");
        harfler.add(1,"L");

        System.out.println(harfler);

        harfler.set(4,"E");

        System.out.println(harfler.set(3,"I"));

        harfler.remove("F");
        harfler.remove(6);
        System.out.println(harfler);

        Collections.sort(harfler);
        System.out.println(harfler);

        System.out.println(harfler.size());

        harfler.clear();
        System.out.println(harfler);

        System.out.println(harfler.isEmpty());


    }
}
