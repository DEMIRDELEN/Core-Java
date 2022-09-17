package day07_İfStatements;

import java.util.Scanner;

public class C04_Basicİf {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen günü giriniz");

        String gun= scan.nextLine().toUpperCase();

        if (gun.equals("PAZAR") || gun.equals("CUMARTESİ")) {
            System.out.println("haftasonu");

        }
        if (gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA") || gun.equals("PERŞEMBE") || gun.equals("CUMA")) {

            System.out.println("haftaiçi");

        }

        if (!(gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA") || gun.equals("PERŞEMBE")
                || gun.equals("CUMA") || gun.equals("PAZAR") || gun.equals("CUMARTESİ"))) {

            System.out.println("SİKTİR LAN");

        }

    }
}
