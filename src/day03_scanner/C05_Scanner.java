package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        System.out.println("ilk sayıyı girin");

        double sayı1 = scan.nextDouble();

        System.out.println("ikinci sayıyı girin");

        double sayı2 = scan.nextDouble();

        System.out.println("sayıların çarpımı: " + sayı1*sayı2);

        // NOT: klavyeyi ingilizceye çevir


    }
}
