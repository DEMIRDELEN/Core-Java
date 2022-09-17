package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        System.out.println(urunler.indexOf("ikram"));

        System.out.println(urunler.lastIndexOf("ikram"));

        urunler.add("ikram");

        System.out.println(urunler.indexOf("ikram"));

        System.out.println(urunler.lastIndexOf("ikram"));

        System.out.println(urunler);

        System.out.println(urunler.indexOf("hobby"));

        System.out.println(urunler.lastIndexOf("hobby"));


    }
}
