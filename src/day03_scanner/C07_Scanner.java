package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yaşınızı giriniz \naralarda enter tuşuna basınız");

        String isim= scan.nextLine();
        String soyİsim= scan.nextLine();
        int yaş = scan.nextInt();

        System.out.println("Girilen bilgiler: " +isim+" "+soyİsim+" "+yaş);


    }
}
