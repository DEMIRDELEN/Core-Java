package day09_TernaryOperator;

import java.util.Scanner;

public class C16_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayı girin ");

        int sayi =scan.nextInt();

        switch (sayi){
            case 10:
                System.out.println("en küçük ondalık sayı");
                break;
            case 100:
                System.out.println("en küçük yüzdelik sayı");
                break;
            case 1000:
                System.out.println("en küçük binlik sayı");
                break;
            default:
                System.out.println("girdiğin sayıyı değiştir");
        }
    }
}
