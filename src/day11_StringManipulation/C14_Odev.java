package day11_StringManipulation;

import java.util.Scanner;

public class C14_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lürfen 3 basamaklı bir sayı girin");

        int x = scan.nextInt();

        int birler = x%10;
        int toplam= 0;
        toplam+=birler;

        x/=10;
        birler=x%10;
        toplam+=birler;

        x/=10;
        birler=x%10;
        toplam+=birler;

        System.out.println(toplam);
    }
}
