package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_Contains {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        System.out.println(urunler.contains("nutella"));

        System.out.println(urunler.contains("hobby"));

        List<String> urunler2 = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");

        System.out.println(urunler.containsAll(urunler2));

        urunler2.add("hobby");

        System.out.println(urunler.containsAll(urunler2));



    }
}
