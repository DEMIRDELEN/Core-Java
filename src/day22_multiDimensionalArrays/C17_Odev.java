package day22_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C17_Odev {
    public static void main(String[] args) {

        // Soru 6: verilen bir arrayde istenen değere eşit olan elemanları
        // kaldırıp, kalanları yeni bir array olarak yazdırın

        int arr2[]={7,8,9,10,7,12,7,10,7,6,3,12,34,2,1};

        Scanner scan=new Scanner(System.in);

        System.out.println("silmek istediğiniz dizi değerini giriniz");

        int silDeger=scan.nextInt();

        int sayac=0;

        for (int i = 0; i <arr2.length ; i++) {
            if (silDeger==arr2[i]){
                sayac++;
            }
        }

        int yarr []=new int[arr2.length-sayac];

        int yarrindex=0;

        for (int i = 0; i <arr2.length ; i++) {
            if (silDeger!=arr2[i]){
                yarr[yarrindex]=arr2[i];
                yarrindex++;
            }
        }

        System.out.println(Arrays.toString(yarr));
    }
}
