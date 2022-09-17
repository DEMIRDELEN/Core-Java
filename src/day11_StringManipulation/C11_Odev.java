package day11_StringManipulation;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen isim girin");

        String isim= scan.next();

        System.out.println(isim.indexOf(isim,isim.length()-2)*3);
    }
}
