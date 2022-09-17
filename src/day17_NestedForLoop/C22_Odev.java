package day17_NestedForLoop;

import java.util.Scanner;

public class C22_Odev {
    /*
    Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.

    Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
    Input :

    6

    Output:

    6 Mukemmel Sayidir.

    ======================

    Input

    7

    Output:

    7 Mukemmel Sayidir degildir.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int sayi;

        do {

            System.out.println("lutfen bir pozitif sayi girin");
            sayi = scan.nextInt();
            if (sayi > 0) {

                int toplam = 0;

                for (int i = 1; i < sayi; i++) {

                    if (sayi % i == 0) {
                        toplam += i;
                    }

                }

                if (toplam == sayi) {
                    System.out.println(sayi + " mükemmel bir sayı");
                } else {
                    System.out.println("sayi mukemmel sayi degil");
                }
            }

        } while (sayi <= 0);
    }
}