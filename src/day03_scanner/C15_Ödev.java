package day03_scanner;

import java.util.Scanner;

public class C15_Ödev {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi girin");

        char harf = scan.next().toUpperCase().charAt(0);

        System.out.println("ilk harf: "+ harf);
    }
}
