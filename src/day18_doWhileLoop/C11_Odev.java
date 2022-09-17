package day18_doWhileLoop;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int pozitifsayiSayisi = 0;
        int negatifSayiSayisi = 0;
        boolean dongu = false;

        do {

            System.out.println("lutfen istediginiz kadar pozitif sayi girin, " +
                    "hiç yada daha fazla girmeyecekseniz de sıfır girin");
            int sayi = scan.nextInt();


            if (sayi > 0) {
                toplam += sayi;
                pozitifsayiSayisi++;
            } else if (sayi == 0) {
                dongu = true;
            } else {
                System.out.println("negatif sayi giremezsiniz");
                negatifSayiSayisi++;
            }


        } while (dongu == false);


        System.out.println("negatifSayiSayisi = " + negatifSayiSayisi);
        System.out.println("pozitifsayiSayisi = " + pozitifsayiSayisi);
        System.out.println("toplam = " + toplam);
    }
}
