package day23_ArrayLists;

import java.util.Scanner;

public class C15_Odev {
    public static void main(String[] args) {
        // verilen sayidan tum fibonacci sayılarını bir liste yapıp olusturun

        Scanner scan =new Scanner(System.in);

        System.out.println("lutfen sayiyi girin");

        int sayi= scan.nextInt();

        int sayi1=0;
        int sayi2=1;

        System.out.println(sayi1+" ");
        System.out.println(sayi2+" ");

        for (int i = 3; i <sayi ; i++) {
            int sayi3= sayi1+sayi2;
            System.out.println(sayi3+" ");
            sayi1=sayi2;
            sayi2=sayi3;
        }

    }
}
