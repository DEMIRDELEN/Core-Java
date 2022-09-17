package day12_StringManipulation;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isim girin");

        String str= scan.nextLine();

        if (str.contains("a")) {
            System.out.println("girdiğiniz isim \"a\" harfi içeriyor");
        }
        if (str.contains("Z")) {
            System.out.println("girdiğiniz isim \"z\" harfi içermektedir");
        }
        if ((!str.contains("a") && !str.contains("Z"))) {
            System.out.println("girdiğiniz isim a ve Z harfi içermemektedir");
        }
    }
}
