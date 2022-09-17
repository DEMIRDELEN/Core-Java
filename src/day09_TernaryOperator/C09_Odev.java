package day09_TernaryOperator;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen  sayı girin ");

        double sayi=scan.nextDouble();

        System.out.println(sayi>0 ? "sayi pozitif": sayi*sayi);
    }
}
