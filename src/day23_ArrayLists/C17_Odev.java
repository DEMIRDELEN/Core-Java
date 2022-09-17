package day23_ArrayLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class C17_Odev {
    public static void main(String[] args) {

        /*
        6- Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.
Array: [12,15,43,23,56,76,78,90,77,43]
Aranan değer:56
Beklenen Çıktı:
56 sayısı arrayin 4. Elemanı

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen aranan degeri girin");

        int istenen = scan.nextInt();

        int Array[] = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        Arrays.sort(Array);

        for (int i = 0; i < Array.length ; i++) {
            if (Array[i]==istenen){
                System.out.println(istenen+" sayisi arrayin "+(Arrays.binarySearch(Array,Array[i])+1)+". elemanı");
            }
        }

    }
}
