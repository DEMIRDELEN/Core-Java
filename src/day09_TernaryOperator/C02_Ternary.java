package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen sayıyı girin");

        double sayi = scan.nextDouble();

        System.out.println((sayi>0) ? ("sayı pozitif") : sayi*sayi);
    }
}
