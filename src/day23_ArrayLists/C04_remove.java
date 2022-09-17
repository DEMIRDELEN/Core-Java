package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        /*
        remove methodu iki sekilde kullanılır
        1- objeyi yazıp silmesini istersek bize boolean sonuc döner true/false
        2- index girersek bu defa o indeksteki elemani siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler);

        System.out.println(urunler.remove("ikram"));

        System.out.println(urunler);

        System.out.println(urunler.remove("hobby"));

        System.out.println(urunler);

        // ikinci yöntem

        System.out.println(urunler.remove(1));// silinen ürün cıktı verir

        System.out.println(urunler);

        //olmayan kodu silmeye çalışırsan excaption hatası alırsın

        // System.out.println(urunler.remove(4));


    }
}
