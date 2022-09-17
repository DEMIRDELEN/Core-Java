package Practice_day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10_Interview {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String input=scan.nextLine();
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println("ilkSonHarf(input,sayi) = " + ilkSonHarf(input, sayi));




    }

    public static String ilkSonHarf(String input, int sayi) {

        String ilkHarf=input.substring(0,1);
        String sonHarf=input.substring(input.length()-1);
        String toplam=ilkHarf+sonHarf;
        String sonuc="";

        for (int i = 0; i <sayi ; i++) {

            sonuc+=toplam;

        }

        return sonuc;
    }
}
