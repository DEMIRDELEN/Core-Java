package Recap2;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve
        // bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk
// ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan= new Scanner(System.in);

        System.out.println("isim");

        String ad = scan.nextLine();

        System.out.println("ikinci isim");

        String ad1 = scan.nextLine();

        System.out.println(ad.substring(1)+ad1.substring(1));
    }
}
