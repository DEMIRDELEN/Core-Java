package day08_İfStatementsIf;

import java.util.Scanner;

public class C07_Odev {
    public static void main(String[] args) {
        System.out.println("Hellı");
        System.out.println("World");

        int x=8;
        int y=78;

        System.out.println(x+y);

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen sayi girin");

        int sayi= scan.nextInt();

        System.out.println(sayi*sayi/2);
    }
}
