package day07_İfStatements;

import java.util.Scanner;

public class C10_Odev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen istediginiz gunun bas harfini giriniz");

        char harf= scan.next().toLowerCase().charAt(0);

        if (harf=='p') {
            System.out.println("Pazrtesi "+ "Perşembe "+ "Pazar");
        } else if (harf=='s') {
            System.out.println("Salı");
        } else if (harf=='ç') {
            System.out.println("Çarşamba");
        } else if (harf=='c') {
            System.out.println("Cuma "+ "Cumartesi");
        } else {
            System.out.println("siktir la bu harfte gün mü var aq");
        }
    }
}
