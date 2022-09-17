package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class C013_Odev {
    public static void main(String[] args) {

        IsımleriYazdir();
    }

    public static void IsımleriYazdir() {

        Scanner scan=new Scanner(System.in);
        List<String> isimler= new ArrayList<>();
        String isim="";
        do {
            System.out.println("lutfen isim girin, giris islemi bittiyse Q harfini girin");
            isim=scan.nextLine().toLowerCase();
            isimler.add(isim);
        }while (!isim.equals("q"));

        System.out.println(isimler);
    }
}
