package day11_StringManipulation;

import java.util.Scanner;

public class C10_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("cümle gir goççum");

        String cumle = scan.nextLine();
        cumle = cumle.toLowerCase();

        if (cumle.contains("buyuk") && cumle.contains("kucuk")) {
            System.out.println("böyük mü göccük mü karar ver yeğen");
        } else if (cumle.contains("buyuk")) {
            System.out.println("cümlede büyük kelimesi geçiyor");
        } else if (cumle.contains("kucuk")) {
            System.out.println("cumlede kucuk kelimesi geçiyor");
        } else {
            System.out.println("cümlede büyük guccuk bir bok yok");
        }
    }
}
