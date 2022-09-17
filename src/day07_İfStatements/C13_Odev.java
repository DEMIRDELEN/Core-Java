package day07_İfStatements;

import java.util.Scanner;

public class C13_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("dikdörtgenin uzun kenarı");

        double uzun = scan.nextDouble();

        System.out.println("kısa kenar ?");

        double kısa = scan.nextDouble();

        if (uzun == kısa) {
            System.out.println("dikdortgenimiz bir karedir.");

        } else {
            System.out.println("diktortgen kare degil.");
        }
    }
}