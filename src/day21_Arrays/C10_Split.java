package day21_Arrays;

import java.util.Arrays;

public class C10_Split {
    public static void main(String[] args) {
        /*
        split metodu bir array metodu degil
        bir string metodu dur ama array döndurdugu icin bu konuda anlatılıyor
         */

        String str="java ne kadar guzel";
        String kelimeler[]=str.split("ne");
        System.out.println(Arrays.toString(kelimeler));

        String kelimeler1[]=str.split("e");
        System.out.println(Arrays.toString(kelimeler1));

        String kelimeler2[]=str.split("");
        System.out.println(Arrays.toString(kelimeler2));
    }
}
