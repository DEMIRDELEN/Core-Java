package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C19_Odev {
    public static void main(String[] args) {

        /*
        8- Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.
Array: [1232,2345,5467,678,3454,2312,3451]

         */

        int Array[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <Array.length ; i++) {
            sayilar.add(Array[i]);
        }

        Collections.sort(sayilar);

        System.out.println(sayilar.get(sayilar.size()-2));


    }
}
