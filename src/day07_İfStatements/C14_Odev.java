package day07_İfStatements;

import java.util.Scanner;

public class C14_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("gun adı");

        String gun= scan.next().toUpperCase();

        if (gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA") ||
                gun.equals("PERŞEMBE") || gun.equals("CUMA") || gun.equals("CUMARTESİ") || gun.equals("PAZAR")) {

            System.out.println(gun.toUpperCase().charAt(0)+" "+ gun.toLowerCase().charAt(1)+" "+ gun.toLowerCase().charAt(2));

        } else {
            System.out.println("lutfen gecerli bir gun giriniz");
        }

    }

}
