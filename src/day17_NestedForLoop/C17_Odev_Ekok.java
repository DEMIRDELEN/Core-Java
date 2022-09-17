package day17_NestedForLoop;

import java.util.Scanner;

public class C17_Odev_Ekok {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("ilk sayı");

        int sayi1= scan.nextInt();

        System.out.println("ikinci sayı");

        int sayi2= scan.nextInt();

        ekokAlmaKe(sayi1,sayi2);

    }

    public static void ekokAlmaKe(int sayi1, int sayi2) {
        int ekok =0;
        int buyuk=Math.max(sayi1,sayi2);

        for (int i = buyuk; i <=sayi1*sayi2 ; i++) {
            if (i%sayi1==0 && i%sayi2==0){
                ekok=i;
            }
        }

        System.out.println(ekok);
    }
}
