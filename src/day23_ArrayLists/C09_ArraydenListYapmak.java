package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {

        /*
        list ile calisirken en kotu ozelligi elemanlari tek tek eklemektirtir,
         */

        Integer [] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};

        /*
        bu kadar cok elemanli bir listeyi tek tek eleman olarak
        girmek yerine array olusturup for loop ile
        olusturdugumuz list e tasıyabiliriz
         */

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar);

        /*
        bu islemi yapmasi icin javanın olsturdugu bir method da var ancak bu yontemin cok yan etkisi var
        1- bu sekilde olusturulan listede add remove gibi size'ı degistiren methodlar kullanılamaz.
        2- as list methodu ile olsuturulan liste ve kaynak olan array birbiri ile ilisik
         olarak hayatlarına devam ederler, birinde yaptigimiz degisiklik otomatik olarak digerine de isler
         */

        List<Integer> sayilar2 = Arrays.asList(arr);

        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar);

      //  sayilar2.add(5);
      //  System.out.println(sayilar2); exception veriyor

        arr[0]=20;

        System.out.println(Arrays.toString(arr));

        System.out.println(sayilar2);

        /*
        arrayde degisikli yapınca listem degisiyor listede yapınca arrayde de degisiyor
         */
    }

}
