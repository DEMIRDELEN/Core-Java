package day07_İfStatements;

import java.util.Scanner;

public class C16_Odev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("maaş teklifi");

        double maas= scan.nextDouble();

        if (maas>=80000) {
            System.out.println("kabul ediyorum");
        } else if (maas>=60000 && maas<80000) {
            System.out.println("konuşulur");
        } else {
            System.out.println("maalesef kardeş köle değilim");
        }
    }
}
