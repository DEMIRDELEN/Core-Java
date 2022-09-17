package day03_scanner;

import java.util.Scanner;

public class C09_Ödev {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ilk tam sayı");

        int sayı= scan.nextInt();

        System.out.println("ikinci sayı");

        int sayı1= scan.nextInt();

        System.out.println("sayıların toplamı: " + (sayı + sayı1));
        System.out.println("sayıların çarpımı: " + sayı*sayı1);
        System.out.println("sayıların farkı: " + (sayı-sayı1));


    }
}
