package day03_scanner;

import java.util.Scanner;

public class C14_Ödev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("isminizi ve soyisminizi yazınız\nisminizi girdikten sonra enter'a basıp soyisminizi girin sonra tekrar enter'a basın");

        String isim= scan.nextLine();
        String soyİsim= scan.nextLine();

        System.out.println("isim - soyisim: "+ isim+" "+ soyİsim);
    }
}
