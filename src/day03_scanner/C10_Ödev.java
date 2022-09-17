package day03_scanner;

import java.util.Scanner;

public class C10_Ödev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen karenin bir kenarının uzunluğunu yazın");

        double kenar= scan.nextDouble();

        System.out.println("karenin alanı: "+ kenar*kenar);
        System.out.println("karenin çevresi: "+ 4*kenar);

    }
}
