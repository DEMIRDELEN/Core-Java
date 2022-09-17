package day11_StringManipulation;

import java.util.Scanner;

public class C13_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen kg girin");

        double kg= scan.nextDouble();

        System.out.println("boy (M)");

        double boy= scan.nextDouble();

        double index= kg/boy;

        if (index<18.5) {
            System.out.println("zayıfsın");

        }else if (index>=18.5 && index<25) {
            System.out.println("ideal kilo");
        }else if (index>=25 && index<30){
            System.out.println("şişmansınız");
        } else {
            System.out.println("obezke aq");
        }

        System.out.println(Integer.MAX_VALUE);

    }
}
