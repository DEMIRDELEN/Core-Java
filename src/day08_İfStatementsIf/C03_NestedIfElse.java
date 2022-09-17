package day08_İfStatementsIf;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        /*Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
Girdiği sayi 5’e   bölünüyorsa son rakamını kontrol edin.
Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.*/

        System.out.println("lutfen dort basamaklı sayı girin");

        int tamSayi= scan.nextInt();

        if (tamSayi<1000 || tamSayi>9999) {
            System.out.println("dört basamaklı gir ");
        }else if (tamSayi%5==0) {
            if (tamSayi%2==0) {
                System.out.println("5'e bölünen çift sayı");
            } else {
                System.out.println("5'e bölünebilen tek sayı");
            }
        } else {
            System.out.println("tekrar deneyin");
        }

        }
}
