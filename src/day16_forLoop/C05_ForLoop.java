package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        iki sayı iste
        girilen sayılar ve aralarındaki tüm tamsayıları toplayıp yazdıran method yaz

         */
        Scanner scan= new Scanner(System.in);

        System.out.println("ilk tamsayı");

        int sayi1=scan.nextInt();

        System.out.println("ikinci sayi");

        int sayi2=scan.nextInt();

        aralarlaTopla(sayi1,sayi2);

    }

    public static void aralarlaTopla(int sayi1, int sayi2) {
        int toplam=0;
        if (sayi1<=sayi2){
            for (int i = sayi1; i <= sayi2 ; i++) {
                toplam+=i;
            }
        }else {
            for (int i = sayi2; i <= sayi1 ; i++) {
                toplam+=i;

            }
        }
        System.out.println(toplam);
        }

    }




