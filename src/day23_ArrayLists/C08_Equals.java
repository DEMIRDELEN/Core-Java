package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C08_Equals {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        List<String> urunler2 = new ArrayList<>();

        urunler2.add("ikram");
        urunler2.add("nutella");
        urunler2.add("cay");
        urunler2.add("çekirdek");

        System.out.println(urunler.equals(urunler2));

        Collections.sort(urunler);
        Collections.sort(urunler2);

        System.out.println(urunler.equals(urunler2));

    }
}
