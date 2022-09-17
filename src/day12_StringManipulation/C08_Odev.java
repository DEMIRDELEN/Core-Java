package day12_StringManipulation;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isim girin");

        String ad= scan.nextLine();

        System.out.println("lutfen soyisim girin");

        String soyad= scan.nextLine();

        if (ad.length()>soyad.length()) {
            System.out.println("isminiz daha uzun");
        } else if (ad.length()<soyad.length()) {
            System.out.println("soyisminiz daha uzun");
        } else {
            System.out.println("isim ve soyisim uzunluğu birbirine eşit");
        }

    }
}
