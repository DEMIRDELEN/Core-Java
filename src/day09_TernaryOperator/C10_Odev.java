package day09_TernaryOperator;

import java.util.Scanner;

public class C10_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen  sayı girin ");

        int sayi=scan.nextInt();

        System.out.println(sayi<10 ? sayi : sayi<100 ? "sayı iki basamakli" : "üç basamaklı veya daha büyük sayı");
    }
}
