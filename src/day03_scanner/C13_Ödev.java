package day03_scanner;

import java.util.Scanner;

public class C13_Ödev {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi ve soyisminizi yazınız\nher bir değeri girdikten sonra enter'a basınız");

        String isim= scan.nextLine();
        String soyİsim= scan.nextLine();

        System.out.println("isim: "+ isim);
        System.out.println("soyİsim: " + soyİsim);
        System.out.println("kursumuza katılımınız alınmıştır, teşekkürler..");
    }
}
