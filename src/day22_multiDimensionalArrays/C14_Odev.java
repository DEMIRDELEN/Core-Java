package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C14_Odev {
    public static void main(String[] args) {

        //ic arraylerin tümünü topla ve yeni array e ata

        int sayilar [][]={{1,2,3},{4,5},{6,7}};

        int yeniArray[]=new int[sayilar.length];

        int toplam =0;

        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j <sayilar[i].length ; j++) {

                toplam+=sayilar[i][j];

            }
            yeniArray[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(yeniArray));
    }
}
