package day12_StringManipulation;

import java.util.Scanner;

public class C11_Odev {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen isim girin");

        String isim= scan.nextLine();


        System.out.println("lutfen soyisim girin");

        String soyİsim= scan.nextLine();


        System.out.println("lutfen kart no girin");

        String KartNo= scan.nextLine();


        System.out.println("isim-soyisim: "+isim.substring(0,1).toUpperCase()+isim.replaceAll("\\w","*").substring(1,isim.length())+
                " "+soyİsim.substring(0,1).toUpperCase()+soyİsim.replaceAll("\\w","*").substring(1,soyİsim.length()));
        System.out.println("kart No: "+ KartNo.substring(0,4)+" **** **** ****");
    }
}
