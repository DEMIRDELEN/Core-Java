package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp03 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");


        buyukHarfleYazdir(l);
        System.out.println();
        buyukHarfleYazdir2(l);
        System.out.println();
        buyukHarfleYazdir3(l);
        System.out.println();
        sıralama(l);
        System.out.println();
        uzunlugaGöreTersYazdir(l);
        System.out.println();
        sonKaraktereGöreTekrarsizSirala(l);
        System.out.println();
        onceİlkKaraktereGoreSonraIlkHarfeGoreSiralama(l);
        System.out.println();
        //beştenBuyukleriSil(l);
        //baslangiciAYadaSonuNOlaniSil(l);
        //baslangiciAYadaSonuNOlaniSil2(l);
        //uzunluguSekizIleOnArasıOlanYadaOIleBiteniSil(l);
        System.out.println("uzunlugu On Ikiden Az Mi: " + uzunluguOnIkidenAzMi(l));
        System.out.println();
        System.out.println("xIleBasliyorMu(l) = " + xIleBaslamiyorMu(l));
    }

    // 1- tum elemanlari buyuk harf ile yazdıran bir method olusturun.
    public static void buyukHarfleYazdir(List<String> l) {
        List<String> buyuk = l.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.print(buyuk);
    }

    //2.yol
    public static void buyukHarfleYazdir2(List<String> l) {
        l.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //3.YOL
    public static void buyukHarfleYazdir3(List<String> l) {
        l.replaceAll(String::toUpperCase);
        System.out.println(l);
    }
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.

    public static void sıralama(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGöreTersYazdir(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.

    public static void sonKaraktereGöreTekrarsizSirala(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.

    public static void onceİlkKaraktereGoreSonraIlkHarfeGoreSiralama(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(String::length).thenComparing(Utils::ılkKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //6) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    // public static void beştenBuyukleriSil(List<String> l){
    //     l.removeIf(t-> t.length()>5);
    //     System.out.println(l);
    // }

    //7) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    // public static void baslangiciAYadaSonuNOlaniSil(List<String> l) {
    //     l.removeIf(t -> t.charAt(0) == 'A' || t.charAt(0) == 'a' || t.charAt(0) == 'N' || t.charAt(0) == 'n');
    //     System.out.println(l);
//
    // }

    // 2. yol

    // public static void baslangiciAYadaSonuNOlaniSil2(List<String> l) {
    //     l.removeIf(t -> t.startsWith("a") || t.startsWith("A") || t.startsWith("N") || t.startsWith("n"));
    //     System.out.println(l);
    // }

    //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.

    public static void uzunluguSekizIleOnArasıOlanYadaOIleBiteniSil(List<String> l) {
        l.removeIf(t -> !(t.length() == 9 || t.endsWith("o") || t.endsWith("O")));
        System.out.println(l);
    }

    //9) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden bir method oluşturun.

    public static boolean uzunluguOnIkidenAzMi(List<String> l) {

        return l.stream().allMatch(t-> t.length()<12);
    }

    //10) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> l) {

        return l.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11) Herhangi bir elemanın 'r' ile bitip bitmediğini kontrol eden bir method oluşturun.

    public static boolean rIleBitiyorMu(List<String> l) {

        return l.stream().anyMatch(t-> t.endsWith("r"));
    }


}
