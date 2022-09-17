package day12_StringManipulation;

import java.util.Scanner;

public class C19_Odev {
    // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 3basamaklı bir sayı giriniz");
        int a = scan.nextInt();
        int b3 = a % 10;
        a /= 10;
        int b2 = a % 10;
        a /= 10;
        int b1 = a % 10;

        switch (b1) {
            case 1:
                String ucb = "yüz";
                System.out.print(ucb);
                break;
            case 2:
                ucb = "ikiyüz";
                System.out.print(ucb);
                break;
            case 3:
                ucb = "üçyüz";
                System.out.print(ucb);
                break;
            case 4:
                ucb = "dörtyüz";
                System.out.print(ucb);
                break;
            case 5:
                ucb = "beşyüz";
                System.out.print(ucb);
            case 6:
                ucb = "altıyüz";
                System.out.print(ucb);
                break;
            case 7:
                ucb = "yediyüz";
                System.out.print(ucb);
                break;
            case 8:
                ucb = "sekizyüz";
                System.out.print(ucb);
                break;
            case 9:
                ucb = "dokuzyüz";
                System.out.print(ucb);
                break;
            default:
        }

        switch (b2) {
            case 1:
                String ikib = "on";
                System.out.print(ikib);
                break;
            case 2:
                ikib = "yirmi";
                System.out.print(ikib);
                break;
            case 3:
                ikib = "otuz";
                System.out.print(ikib);
                break;
            case 4:
                ikib = "kırk";
                System.out.print(ikib);
                break;
            case 5:
                ikib = "elli";
                System.out.print(ikib);
                break;
            case 6:
                ikib = "altmış";
                System.out.print(ikib);
                break;
            case 7:
                ikib = "yetmiş";
                System.out.print(ikib);
                break;
            case 8:
                ikib = "seksen";
                System.out.print(ikib);
                break;
            case 9:
                ikib = "doksan";
                System.out.print(ikib);
                break;
            default:
        }

        switch (b3) {
            case 1:
                String birb = "bir";
                System.out.println(birb);
                break;
            case 2:
                birb = "iki";
                System.out.println(birb);
                break;
            case 3:
                birb = "üç";
                System.out.println(birb);
                break;
            case 4:
                birb = "dört";
                System.out.println(birb);
                break;
            case 5:
                birb = "beş";
                System.out.println(birb);
                break;
            case 6:
                birb = "altı";
                System.out.println(birb);
                break;
            case 7:
                birb = "yedi";
                System.out.println(birb);
                break;
            case 8:
                birb = "sekiz";
                System.out.println(birb);
                break;
            case 9:
                birb = "dokuz";
                System.out.println(birb);
                break;
            default:
                System.out.println("rakam girin");
        }
    }
}