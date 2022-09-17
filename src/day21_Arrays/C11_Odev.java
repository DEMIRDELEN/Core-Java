package day21_Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C11_Odev {
    public static void main(String[] args) {
        /*
        1- Karışık verilen sayıları ve kelimeleri sıralayan Java kodunun yazınız.
not: Test datadaki değerleri kullanınız.
Test Data:
[1232, 1134,2345,1022]
[Java, Python, PHP, C#, C Programming, C++]
Beklenen Çıktı:
[1022,1134,1232,2345]
[C Programming, C#, C++, Java, PHP, Python]
         */

        int array[] = {1232, 1134, 2345, 1022};
        String array2[] = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};

        List<Integer> arraySayi=new ArrayList<>();

        for (int i = 0; i < array.length ; i++) {

            arraySayi.add(array[i]);
        }

        List<String> arrayKelime=new ArrayList<>();

        for (int i = 0; i < array2.length ; i++) {

            arrayKelime.add(array2[i]);
        }

        Collections.sort(arraySayi);
        Collections.sort(arrayKelime);

        System.out.println(arraySayi);
        System.out.println(arrayKelime);

    }
}
