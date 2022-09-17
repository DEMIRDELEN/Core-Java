package day17_NestedForLoop;

import java.util.Scanner;

public class C19_Odev {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

        Input : 6

        Output: 6!=65432*1=720
         */


        Scanner scan = new Scanner(System.in);

        int sayi;

        do {
            System.out.println("lutfen pozitif tam sayiyi girin");

            sayi = scan.nextInt();

            if (sayi > 0) {

                int ilk = 1;

                for (int i = sayi; i > 0; i--) {

                    ilk = ilk * i;
                }
                System.out.println("sonuc: "+ilk);

            } else if (sayi == 0) {

                System.out.println("sonuc: 0");

            } else {
                System.out.println("");

            }
        } while (sayi < 0);
    }
}