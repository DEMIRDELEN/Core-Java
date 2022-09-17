package day10_StringManipulation;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen bir cumle girin");

        String str = scan.nextLine();

        System.out.println("lutfen bir harf girin");

        char harf = scan.next().charAt(0);

        if (str.indexOf(harf)==-1) {
            System.out.println("bu harf cümlede gecmiyor");
        } else {
            System.out.println("bu harfin indeksi: " + str.indexOf(harf));
        }
    }
}
