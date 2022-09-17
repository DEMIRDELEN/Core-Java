package day09_TernaryOperator;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen  sayı girin ");

        int sayi=scan.nextInt();

        System.out.println(sayi>0 ? sayi : (-1*sayi));
    }
}
