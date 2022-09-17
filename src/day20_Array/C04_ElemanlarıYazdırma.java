package day20_Array;

import java.util.Arrays;

public class C04_ElemanlarıYazdırma {
    public static void main(String[] args) {

        int sayilar[]={1,2,3,4,5,6,7};
        for (int i = 0; i < sayilar.length ; i++) {
           if (i< sayilar.length-1){
               System.out.print(sayilar[i]+", ");
           } else {
               System.out.println(sayilar[i]);
           }
        }

        System.out.println("");
        System.out.println(Arrays.toString(sayilar));
    }
}
