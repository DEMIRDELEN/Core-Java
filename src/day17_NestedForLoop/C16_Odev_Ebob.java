package day17_NestedForLoop;

import java.util.Scanner;

public class C16_Odev_Ebob {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("ilk sayı");

        int sayi1= scan.nextInt();

        System.out.println("ikinci sayı");

        int sayi2= scan.nextInt();

        ebobAlke(sayi1,sayi2);
    }

    public static void ebobAlke(int sayi1, int sayi2) {
        int ebob=0;
        int kucuk=Math.min(sayi1,sayi2);
        for (int i = 1; i <=kucuk ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob = " + ebob);
    }
}
