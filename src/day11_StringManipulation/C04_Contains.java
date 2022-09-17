package day11_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen cumle giriniz");

        String cumle =scan.nextLine();

        cumle = cumle.toLowerCase();

        if (cumle.contains("buyuk") && (cumle.contains("kucuk"))) {
            System.out.println("buyuk mu kucuk mu");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if ((cumle.contains("buyuk"))) {
            System.out.println(cumle.toUpperCase());
        } else {
            System.out.println("cumle büyük ya da kucuk kelimelerini içermiyor");
        }
    }
}
