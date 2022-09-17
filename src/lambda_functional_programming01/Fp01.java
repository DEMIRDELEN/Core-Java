package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {
    /*
    1- Lambda (functional programming) java 8 ile kullanılmaya başlanmıştır.
    2- functional programming'de ne yapılacak üzerine yoğunlaşılır.
       Structured programming (nasıl yapılacak) üzerine yoğunlaşır.
    3- functional_programming; Arrays ve collections ile kullanılır.
    4- "entrySet() methodu ile Map, Set'e donusturulerek functional programming'de kullanılabilir.
    5-
     */
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        System.out.println(l);

        ListElemanlariniAyniSatirdaYazdirStructured(l);
        System.out.println();
        ListElemanlariniAyniSatirdaYazdirFunctional(l);
        System.out.println();
        CiftListElemanlariniAyniSatirdaYazdirStructured(l);
        System.out.println();
        CiftListElemanlariniAyniSatirdaYazdirFunctional(l);
        System.out.println();
        TekListElemanlarininKaresiniAlipYazdirFunctional(l);
        System.out.println();
        tekrarsızTekElemanlarinKupunuYazdir(l);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(l);
    }

    //1) Ardışık list elementlerini aynı satırda aralarında boşluk bırakarak yazdıraN bir method oluşturun.(Structured)

    public static void ListElemanlariniAyniSatirdaYazdirStructured(List<Integer> l) {

        for (Integer each : l
        ) {
            System.out.print(each + " ");
        }

    }

    public static void ListElemanlariniAyniSatirdaYazdirFunctional(List<Integer> l) {

        l.stream().forEach(t -> System.out.print(t + " "));
        // stream() methodu collection dan elementleri akışa dahil etmek için ve methodlara ulasmak için kullanılır.

    }

    // 2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void CiftListElemanlariniAyniSatirdaYazdirStructured(List<Integer> l) {

        for (Integer each : l
        ) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }
        }
    }

    public static void CiftListElemanlariniAyniSatirdaYazdirFunctional(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    // 3) Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void TekListElemanlarininKaresiniAlipYazdirFunctional(List<Integer> l) {

        l.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        // elemanlarin degerleri degisecekse map() methodu kullanilir.
    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekrarsızTekElemanlarinKupunuYazdir(List<Integer> l) {

        l.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.

    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> l) {

        Integer toplam = l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print("toplam = " + toplam);
    }

    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKupununCarpimi(List<Integer> list) {

        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);

        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    //1. Yol:
    public static void getMaxEleman01(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);

        System.out.println(max);
    }

    //2. Yol:
    public static void getMaxEleman02(List<Integer> list) {

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u);

        System.out.println("max = " + max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)

    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
    //1. Yol:
    public static void getYedidenBuyukCiftMin(List<Integer> list) {

        Integer min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);

        System.out.println(min);
    }

    //2. Yol:
    public static void getYedidenBuyukCiftMin2(List<Integer> list) {

        Integer min = list.
                stream().
                distinct().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted(Comparator.reverseOrder()).
                reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println(min);
    }

    //3. Yol:
    public static void getYedidenBuyukCiftMin3(List<Integer> list) {

        Integer min = list.
                stream().
                filter(t -> t % 2 == 0).
                filter(t -> t > 7).
                sorted().
                findFirst().
                get();

        System.out.println(min);

    }

    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void getTersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer> list) {

        List<Double> sonuc = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sonuc);

    }
}
