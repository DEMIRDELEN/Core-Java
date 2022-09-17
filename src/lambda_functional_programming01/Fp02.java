package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */
    public static void main(String[] args) {
        //1) Ardışık list elemanlarını aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional ve method reference)

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
        System.out.println();
        listElemanlariniYazdir(l);
        System.out.println();
        ciftElemanlariYazdir(l);
        System.out.println();
        ardisikTekElemanlarinKareleriniYazdir(l);
        System.out.println();
        tekrarsizCiftElemanlarinKuplerininCarpimi(l);
        System.out.println();
        listdeEnBuyukElemaniBul(l);
        System.out.println();
        MinDeger(l);
        System.out.println();
        yedidenBuyukCiftMinDeger(l);
        System.out.println();
        tersSiraliTekrarsiz5tenbuyukElemanlarinYariDegerleriniBulanMethod(l);


    }

    public static void ardisikTekElemanlarinKareleriniYazdir(List<Integer> l) {

        l.stream().filter(Utils::tekElemaniSec).map(t -> t * t).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    public static void ciftElemanlariYazdir(List<Integer> l) {

        l.stream().filter(Utils::ciftElemaniSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    public static void listElemanlariniYazdir(List<Integer> l) {

        l.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    //1. Yol
   // public static void tekrarsizCiftElemanlarinKareToplami01(List<Integer> l){
//
   //     Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0, Math::addExact);
   //     System.out.println(toplam);
//
   // }
   // //2. Yol
   // public static void tekrarsizCiftElemanlarinKareToplami02(List<Integer> list){
//
   //     Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(Math::addExact).get();
   //     System.out.println(toplam);
//
   // }
//
   // //3. Yol
   // public static void tekrarsizCiftElemanlarinKareToplami03(List<Integer> list){
//
   //     Integer toplam = list.stream().distinct().filter(Utils::ciftElemaniSec).map(Utils::karesinAl).reduce(0,Integer::sum);
   //     System.out.println(toplam);
//
   // //---------
//
    //6) tekrarsız çift elemanlarin küpünün çarpımını hesaplayan bir method olusturun

    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> l) {

        Integer carpim = l.stream().distinct().filter(Utils::ciftElemaniSec).map(t -> t * t * t).reduce(1, Math::multiplyExact);
        System.out.println(carpim);
    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.

    public static void listdeEnBuyukElemaniBul(List<Integer> l) {

        Integer max = l.stream().distinct().reduce(Math::max).get();
        System.out.println(max);
    }

    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)

    public static void MinDeger(List<Integer> l) {
        Integer minDeger = l.stream().distinct().reduce(Math::min).get();
        System.out.println(minDeger);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMinDeger(List<Integer> l) {
        Integer yedidenbuyuk = l.stream().distinct().filter(t -> t > 7).filter(t -> t % 2 == 0).reduce(Math::min).get();
        System.out.println(yedidenbuyuk);
    }
    //10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public static void tersSiraliTekrarsiz5tenbuyukElemanlarinYariDegerleriniBulanMethod(List<Integer> l) {

        List<Double> ters = l.
                stream().
                distinct().
                filter(t -> t > 5).
                map(Utils::IntegerDegerinYarisiniAl).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(ters);
    }

}
