package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C16_Odev {
    public static void main(String[] args) {
        // verilen sayidan tum fibonacci sayılarını bir liste yapıp olusturun

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen sayiyi girin");

        int sayi = scan.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;

        List<Integer> fibonacci = new ArrayList<>();

        fibonacci.add(sayi1);
        fibonacci.add(sayi2);

        for (int i = 3; i < sayi; i++) {
            int sayi3 = sayi1 + sayi2;
            fibonacci.add(sayi3);
            sayi1 = sayi2;
            sayi2 = sayi3;
        }

        System.out.println(fibonacci);
    }
}

