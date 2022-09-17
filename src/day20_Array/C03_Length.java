package day20_Array;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {
        // iki şekilde array oluşturulur

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("sayilar arrayin uzunluğu: "+sayilar.length);


        System.out.println("harfler arrayinin uzunluğu :"+ harfler.length);

        System.out.println(Arrays.toString(harfler));

        System.out.println(harfler[harfler.length-1]);


       // System.out.println(harfler[5]);
    }
}
