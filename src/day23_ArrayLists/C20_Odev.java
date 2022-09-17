package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C20_Odev {
    public static void main(String[] args) {
        /*
        9- Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.
Array: [1,2,3,4,5,6,7,8,9]
Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4

         */
        int Array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> Cıft = new ArrayList<>();
        List<Integer> tek = new ArrayList<>();

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] % 2 == 0) {
                Cıft.add(Array[i]);
            } else {
                tek.add(Array[i]);
            }
        }

        System.out.println("tek = " + tek.size());
        System.out.println("Cıft = " + Cıft.size());
    }
}
