package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Sort {

    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        Collections.sort(urunler);

        System.out.println(urunler);

        /*
        list ile gelen sort methodunda siralama ozelligini girmek gerekiyor, bunun yerine
        collections class ından sort methodunu kullanıyoruz bu method
        listemizi natural order a gore siralar
         */
    }
}
