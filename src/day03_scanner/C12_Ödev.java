package day03_scanner;

import java.util.Scanner;

public class C12_Ödev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen dikdörtgenler prizmasının kısa kenarını, uzun kenarını ve yüksekliğini sırayla giriniz\nher bir değeri girdikten sonra enter'a basınız");

        double kısa= scan.nextDouble();
        double uzun= scan.nextDouble();
        double yükseklik = scan.nextDouble();

        System.out.println("hacim: "+ kısa*uzun*yükseklik);
    }
}
