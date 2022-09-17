package day12_StringManipulation;

import java.util.Scanner;

public class C09_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen 4 harfli kelime girin");

        String ad= scan.nextLine();

        System.out.println(ad.substring(3)+ad.substring(2,3)+ad.substring(1,2)+ad.substring(0,1));

    }
}
