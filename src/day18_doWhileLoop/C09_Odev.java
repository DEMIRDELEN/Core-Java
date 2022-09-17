package day18_doWhileLoop;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int sayiSayisi = 0;

        do {


            System.out.println("lutfen toplam 500 olana kadar sayi girin");
            int sayi = scan.nextInt();
            toplam += sayi;
            sayiSayisi++;


        } while (toplam < 500);

        System.out.println("toplam = " + toplam);
        System.out.println("sayiSayisi = " + sayiSayisi);
    }
}
