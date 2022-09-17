package day09_TernaryOperator;

import java.util.Scanner;

public class C17_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("SDET yazısından bir harf seçip girin ");

        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'S':
                System.out.println("SOFTWARE");
                break;
            case 'D':
                System.out.println("DEVELOPER");
                break;
            case 'E':
                System.out.println("ENGİNEER");
                break;
            case 'T':
                System.out.println("TESTER");
                break;
            default:
                System.out.println("GEÇERLİ HARF GİRİN");
        }
    }
}
