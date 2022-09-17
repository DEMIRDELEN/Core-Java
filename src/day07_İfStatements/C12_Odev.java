package day07_İfStatements;

import java.util.Scanner;

public class C12_Odev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen gunu girin");

        String gun= scan.next().toUpperCase();

        if (gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA") || gun.equals("PERŞEMBE") || gun.equals("CUMA")) {

            System.out.println("haftaiçi");

        } else if (gun.equals("CUMARTESİ") || gun.equals("PAZAR")) {

            System.out.println("haftasonu");
        } else {
            System.out.println("böyle bir gün yok");

    }
}
}