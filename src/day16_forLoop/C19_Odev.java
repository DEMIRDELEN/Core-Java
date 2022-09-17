package day16_forLoop;

import java.util.Scanner;

public class C19_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin");
        int x=scan.nextInt();
        int sayiToplam=0;
        int birlerBas=0;

        while (0<x){

          birlerBas=x%10;
          sayiToplam+=birlerBas;
          x/=10;

        }
        System.out.println("sayiToplam = " + sayiToplam);

    }
}
