package day11_StringManipulation;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen mail adresinizi girin");

        String mail= scan.nextLine();

        if (!mail.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresinizi girin");
        } else if (mail.endsWith("@gmail.com")) {
            System.out.println("gmail adresiniz kaydedildi");

        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }
    }
}
