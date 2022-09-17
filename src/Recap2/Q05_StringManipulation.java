package Recap2;

import java.util.Scanner;

public class Q05_StringManipulation {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("isim");

        String ad = scan.nextLine().toUpperCase();

        System.out.println("soyisim");

        String soy = scan.nextLine().toUpperCase();

        System.out.println(ad.concat(" ").concat(soy));
    }
}
