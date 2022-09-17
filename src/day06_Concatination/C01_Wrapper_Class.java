package day06_Concatination;

import java.util.Scanner;

public class C01_Wrapper_Class {

    public static void main(String[] args) {

        String str= "java ile hayat hojj";

        System.out.println(str.toUpperCase());

        Boolean buGözelMi=true;
        buGözelMi.toString();

        System.out.println(Short.MIN_VALUE);

        Scanner scan= new Scanner(System.in);
        System.out.println("5 basamaklı şifre gir");

        String sifre=scan.nextLine();

        int sifreSayı= Integer.parseInt(sifre);

        System.out.println(sifre+3);
        System.out.println(sifreSayı+3);
    }
}
