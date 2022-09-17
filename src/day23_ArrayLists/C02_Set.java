package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Set {
    public static void main(String[] args) {
        /*
        elimizde ürünlerin bulunduğu bir liste var
        urun listesindeki istenen sıradaki ürünü yenisi ile degistirip eski urunu, var olan eski ürünler listesine ekleyelim

         */
        List<String> urunler = new ArrayList<>();
        urunler.add("nutella");
        urunler.add("ikram");
        urunler.add("çekirdek");
        urunler.add("cay");

        List<String> eskiurunler = new ArrayList<>();

        String yeniUrun = "biskrem";
        String silinecekUrun = "ikram";

        int temp = urunler.indexOf(silinecekUrun);

        String silinenUrun = urunler.set(temp, yeniUrun);

        eskiurunler.add(silinenUrun);

        System.out.println("liste: "+ urunler);
        System.out.println("eski urunler: "+ eskiurunler);



        yeniUrun = "kahve";
        silinecekUrun = "cay";

        temp = urunler.indexOf(silinecekUrun);
        silinenUrun = urunler.set(temp,yeniUrun);

        eskiurunler.add(silinenUrun);

        System.out.println("liste: "+ urunler);
        System.out.println("eski urunler: "+ eskiurunler);

    }
}
