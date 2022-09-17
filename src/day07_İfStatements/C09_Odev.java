package day07_İfStatements;

import java.util.Scanner;

public class C09_Odev {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir tam sayi girin");

        double sayi1 = scan.nextDouble();

        if (sayi1 % 2 == 0) {
            System.out.println("sayimiz Cift");
        } else if (sayi1 % 2 == 1) {
            System.out.println("sayimiz tek");
        } else {
            System.out.println("lutfen tam sayi giriniz");
        }
    }
}
