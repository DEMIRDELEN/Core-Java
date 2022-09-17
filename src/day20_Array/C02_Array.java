package day20_Array;

import java.util.Arrays;

public class C02_Array {
    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"ali","ayşe","ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="hasan";

        System.out.println(Arrays.toString(sinifList));
        System.out.println(sinifList[1]);
        System.out.println(sinifList[0]);
    }
}
