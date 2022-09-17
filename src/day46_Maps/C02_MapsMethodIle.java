package day46_Maps;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class C02_MapsMethodIle {
    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = Reuseable_Methods.mapOlustur();
        System.out.println(ogrenciMap);
        System.out.println();

        // value ları sıra numaralı yazdırın.

        Reuseable_Methods.tumValueSiraliYazdir(ogrenciMap);

        System.out.println();

        // isim ve soyisimlerin birlikte olacağı bir liste olusturun.

        List<String> sinifIsimSoyisimList = Reuseable_Methods.IsimSoyisimListesiOlustur(ogrenciMap);

        System.out.println(sinifIsimSoyisimList);

        // KAÇ FARKLI BRANS VARSA BRANS İSMİ=  BRANSTAKİOGRENCİSAYİSİ ŞEKLİNDE YAZDİRİN

        //Reuseable_Methods.BranslariYazdir(ogrenciMap);

        Reuseable_Methods.BranslariYazdir1(ogrenciMap);

    }
}
