package Recap1;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen 5 basamaklı pozitif tam sayı girin");

        int sayi= scan.nextInt();
        int birler = 0;
        int toplam= 0;

        birler= sayi%10;
        toplam+=birler;
        sayi/=10;

        birler= sayi%10;
        toplam+=birler;
        sayi/=10;

        birler= sayi%10;
        toplam+=birler;
        sayi/=10;

        birler= sayi%10;
        toplam+=birler;
        sayi/=10;

        birler= sayi%10;
        toplam+=birler;

        System.out.println(toplam);

    }
}
