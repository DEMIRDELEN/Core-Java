package day25_Constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {

             C01        obje1   =    new            C01()       ;

        // classadi     obje        keyword     constructor

        Scanner scan=new Scanner(System.in);
        List<String> list= new ArrayList<>();
        Random rnd = new Random();

        /*
        javada bir obje olusturabilmek icin mutlaka constructor kullanmak zorundasınız
         */
        System.out.println(obje1.sayi);
        obje1.deneme();
    }
}
