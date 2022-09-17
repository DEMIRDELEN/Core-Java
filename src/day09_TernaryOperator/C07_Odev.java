package day09_TernaryOperator;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen sayı girin ");

        int sayi=scan.nextInt();

        System.out.println(sayi%2==0 ? "sayı çift" : "sayı tek");
    }
}
