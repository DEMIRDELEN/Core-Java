package Practice_day06;

import java.util.Scanner;

public class Q8_Arrays {
    public static void main(String[] args) {
        /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int sayilar[] = new int[8];

        int sayac = 0;

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i + ". indexteki sayıyı giriniz lutfen");
            sayilar[i] = scan.nextInt();
            if (sayilar[i] % 3 == 0) {
                sayac++;
            }
        }
        System.out.println(sayac + " tane 3'e bölünen eleman vardır");
    }
}