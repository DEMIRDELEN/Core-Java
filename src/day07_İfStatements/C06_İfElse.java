package day07_İfStatements;

import java.util.Scanner;

public class C06_İfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("karakter gir");
        char harf = scan.next().charAt(0);

        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("harftir");
        } else {
            System.out.println("harf değil");
        }

    }
}