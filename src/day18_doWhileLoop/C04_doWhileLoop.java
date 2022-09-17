package day18_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tamsayılar alın
        kullanıcı çift sayı girdiği sürece
        sayıları yazdırın
        tek sayı girdiğinde işlemi bitir

         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        //loooplarda kullanılacak variableler loopdan önce oluşturulmalı

        while (sayi % 2 == 0) {
            System.out.println("lutfen bir sayı giriniz");

            sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift");

            } else {
                System.out.println("sayi tek");
            }

        }
        // dowhile dezavantaj- ilk çalıştırma kontrol yapılmadan olduğu için loop un body
        // sinde yanlış bir işlem yapılmamasına dikkat etmek lazım


        do {
            System.out.println("lutfen bir sayı giriniz");

            sayi = scan.nextInt();

            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift");

            } else {
                System.out.println("sayi tek");
            }

        }while (sayi%2==0);

    }
}