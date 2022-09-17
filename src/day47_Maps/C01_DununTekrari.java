package day47_Maps;

import day46_Maps.Reuseable_Methods;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = Reuseable_Methods.mapOlustur();

        //ogrencş listesini isim soyisim olarak yazdirin.
        Reuseable_Methods.tumValueSiraliYazdir(sinifListMap);

        // KAC FARKLI BRANS VARSA BRANS= BRANSTAKİOGRENCİSAYİSİ şeklinde yazdirin

        Reuseable_Methods.bransOgrenciYazdir(sinifListMap);
    }
}
