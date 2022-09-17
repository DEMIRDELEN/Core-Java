package day05_Pre_Post_Increment;

import java.util.Scanner;

public class C02_Modulus_Rakamlar_Toplamı {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen dört basamaklı pozitif bir tam sayı giriniz..");

        int sayı= scan.nextInt();
        int sayı1= sayı;

        int birlerBasamağı=0;
        int rakamlarToplamı=0;

        birlerBasamağı=sayı%10;
        rakamlarToplamı+=birlerBasamağı;
        sayı/=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı+= birlerBasamağı;
        sayı/=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı+= birlerBasamağı;
        sayı/=10;

        birlerBasamağı=sayı%10;
        rakamlarToplamı+= birlerBasamağı;
        sayı/=10;

        System.out.println(sayı1 + " sayısının rakamları toplamı: " + rakamlarToplamı);
    }
}
