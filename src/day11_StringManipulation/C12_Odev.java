package day11_StringManipulation;

import java.util.Scanner;

public class C12_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isim girin");

        String isim= scan.next();

        System.out.println("diğer isim");

        String isim1= scan.next();

        if (isim.length()%2==0) {
            System.out.println("0");
        } else {
            System.out.println("isim1 isim2 ye eklenemiyor");
        }
    }
}
