package Recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen ilk notu girin");

        double ilk= scan.nextDouble();

        System.out.println("lutfen ikinci girin");

        double iki= scan.nextDouble();

        double ort= ilk*0.3+iki*0.7;

        System.out.println("ort = " + ort);

    }
    /*
     * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */

}
