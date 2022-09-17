package day11_StringManipulation;

import java.util.Scanner;

public class C06_Endswith {
    public static void main(String[] args) {
        /*
   Soru 1) Kullanicidan email adresini girmesini isteyin,
   mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
   @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
   @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
    */
        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen mail adresinizi giriniz");

        String email=scan.nextLine();

        if (email.contains("@gmail.com")) {
            System.out.println("lütfen gmail adresini giriniz");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("lütfen yazimi kontrol edin yazdırın");
        }
    }
}
