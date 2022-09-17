package day08_İfStatementsIf;

import java.util.Scanner;

public class C06_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen yıl giriniz");

        int yil = scan.nextInt();

        if (yil % 4 != 0) {
            System.out.println("artik yil degil");
        } else {
            if (yil % 100 != 0) {
                System.out.println("artik yil degil");
            } else {
                if (yil % 400 == 0) {
                    System.out.println("artik yildir");
                } else {
                    System.out.println("artik yil degil");
                }
            }

        }
    }
}
