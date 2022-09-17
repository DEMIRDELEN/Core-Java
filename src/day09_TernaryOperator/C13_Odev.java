package day09_TernaryOperator;

import java.util.Scanner;

public class C13_Odev {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen dikdortgenin uzun ve kısa kenarının uzunlugunu yazınız ");

        double kısa =scan.nextDouble();

        System.out.println(kısa>=100 && kısa<1000 ? "sayı üc basamakli" : "sayi uc basamakli degil");
    }
}
