package day15_Overloading_forLoop;

import java.util.Scanner;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        int sayi1=10;
        int sayı2=5;

        int sonuc= carpGetir(sayi1,sayı2);
        System.out.println(sonuc);
    }

    public static int carpGetir(int sayi1, int sayı2) {
        int sonuc=sayi1*sayı2;
        return sonuc;
    }
}
