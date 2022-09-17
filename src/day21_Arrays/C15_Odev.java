package day21_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C15_Odev {
    public static void main(String[] args) {

        /*
        5- yazılan değerin array içerisinde arayan Java Kodu yazınız.
Array: [1551,1223,1443,1267,1789,1023,2020]
Aranan Değer:2020
Beklenen Çıktı:**True**
Aranan Değer:2010
Beklenen Çıktı :**False**
         */

        int Array[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < Array.length; i++) {
            sayilar.add(Array[i]);
        }

        Collections.sort(sayilar);

        boolean x=sayilar.contains(2020);
        System.out.println(x);
    }
}
