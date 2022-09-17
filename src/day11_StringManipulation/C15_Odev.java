package day11_StringManipulation;

import java.util.Scanner;

public class C15_Odev {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lürfen bir dakika girin");

        int dakika = scan.nextInt();

        int gun = dakika/1440;

        int yıl= dakika/(1440*365);

        System.out.println(gun);
        System.out.println(yıl);
    }
}
