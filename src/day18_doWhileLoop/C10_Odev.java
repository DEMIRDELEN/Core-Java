package day18_doWhileLoop;

import java.util.Scanner;

public class C10_Odev{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam=0;
        int sayiSayisi=0;
        boolean dongu = false;

        do {

            System.out.println("lutfen istediginiz kadar sayi girin, hiç yada daha fazla girmeyecekseniz de sıfır girin");
            int sayi = scan.nextInt();
            toplam+=sayi;
            sayiSayisi++;

            if (sayi==0){

                dongu = true;
            }



        }while (dongu==false);


        System.out.println("sayiSayisi = " + sayiSayisi);
        System.out.println("toplam = " + toplam);
    }
}
