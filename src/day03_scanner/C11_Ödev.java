package day03_scanner;

import java.util.Scanner;

public class C11_Ödev {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("yarıçap?");

        double yarı= scan.nextDouble();

        System.out.println("dairenin alanı: "+ yarı*3.14*yarı);
        System.out.println("dairenin çevresi :"+ 2*3.14*yarı);

    }
}
