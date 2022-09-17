package day22_multiDimensionalArrays;

import java.util.Scanner;

public class C15_Odev {
    public static void main(String[] args) {

        // kullanıcıdan cümle iste ve kaç gelime olduğunu yazdırım

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen cumlenizi girin");

        String cumle=scan.nextLine();

        String array [] =cumle.split(" ");

        System.out.println("kelime sayisi: "+ array.length);
    }
}
