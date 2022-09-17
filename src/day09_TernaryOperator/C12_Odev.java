package day09_TernaryOperator;

import java.util.Scanner;

public class C12_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen dikdortgenin uzun ve kısa kenarının uzunlugunu yazınız ");

        double kısa =scan.nextDouble();
        double uzun= scan.nextDouble();

        System.out.println(kısa==uzun ? "cisim karedir" : "cisim kare değil");
    }
}
