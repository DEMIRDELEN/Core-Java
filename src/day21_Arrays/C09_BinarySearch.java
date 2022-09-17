package day21_Arrays;

import java.util.Arrays;

public class C09_BinarySearch {
    public static void main(String[] args) {

        /*
        binarysearch method u sıralanmış array de aradığımız elementin indeksini döndürür

        ya aradığımız element array da yoksa ?
        (stringde indexof bize olmayan elementler için -1 donduruyordu)

        aradıgımız element array de yoksa java hem olmadığını hem de olsaydı nerede olacagını bize dondurur

        olmadıgını ifade icin eksi kullanır
        olsaydı nerede olacagını belirtmek icin index degil sıralama kullanır
         */

        int sayilar []={3,7,15,4,27,10};

        Arrays.sort(sayilar);

        System.out.println(Arrays.toString(sayilar));

        System.out.println(Arrays.binarySearch(sayilar,4));

        System.out.println(Arrays.binarySearch(sayilar,15));

        System.out.println(Arrays.binarySearch(sayilar,11));

        System.out.println(Arrays.binarySearch(sayilar,6));

        System.out.println(Arrays.binarySearch(sayilar,-100));

        System.out.println(Arrays.binarySearch(sayilar,141));

    }
}
