package day11_StringManipulation;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen mail adresinizi giriniz");

        String email=scan.nextLine();

        if (!email.contains("@gmail")){
            System.out.println("lütfen gmail adresini giriniz");
        } else if (email.lastIndexOf("@gmail.com") == (email.length()-10)) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lütfen yazimi kontrol edin yazdırın");
        }
    }
}
