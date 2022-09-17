package day09_TernaryOperator;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen  sayı girin ");

        char harf =scan.next().charAt(0);

        System.out.println(harf>='a' && harf<='z' ? "küçük harf" : harf>='A' && harf<='Z' ? "buyuk harf" : "harf degil");
    }
}
