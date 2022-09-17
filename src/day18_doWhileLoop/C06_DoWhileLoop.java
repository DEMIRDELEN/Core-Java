package day18_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif
        sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
    “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac
    negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);

        int sayi=0;

        int pozitifSayiAdedi=0;

        int negatifSayi=0;

        int pozitifSayilerToplami=0;

        do {
            System.out.println("lutfen toplamak üzere pozitif tam sayi girin");
            sayi=scan.nextInt();
            if (sayi>0){
                pozitifSayilerToplami+=sayi;
                pozitifSayiAdedi++;
            }else if (sayi<0){
                negatifSayi++;
                System.out.println("sayi negatif");
            }

        }while (sayi!=0);

        System.out.println("pozitif tam sayi adedi = " + pozitifSayiAdedi);
        System.out.println("negatifSayi adedi = " + negatifSayi);
        System.out.println("pozitifSayilerToplami = " + pozitifSayilerToplami);
    }
}
