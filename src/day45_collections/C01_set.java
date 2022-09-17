package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_set {
    public static void main(String[] args) {
        // verilen bir arraydaki tekrar eden elementleri silip tekrarsız halini array e atayan bir code yazınız.

        int arr[] = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};

        Set<Integer> tekrarsizSet = new HashSet<>();

        for (Integer each: arr
             ) {
            tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);

        int tekrarsızArr[]= new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsızArr));

        int i =0;

        for (Integer each: tekrarsizSet
             ) {
            tekrarsızArr[i]=each;
            i++;
        }
        System.out.println(Arrays.toString(tekrarsızArr));

        arr=tekrarsızArr;

        System.out.println("son hal arr: "+Arrays.toString(arr));
    }
}
