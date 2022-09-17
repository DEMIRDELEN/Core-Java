package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_odev {
    public static void main(String[] args) {

        // tekrar eden sayilari bulma

        int arr2[]={7,8,9,10,7,12,7,10,7,6,3,12,34,2,1};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr2.length ; i++) {

            sayilar.add(arr2[i]);

        }

        List<Integer> tekrarEden= new ArrayList<>();

        for (int i = 0; i < arr2.length ; i++) {

            if (sayilar.indexOf(sayilar.get(i)) != sayilar.lastIndexOf(sayilar.get(i))){
                if (!tekrarEden.contains(sayilar.get(i))){
                    tekrarEden.add(sayilar.get(i));
                }
            }
        }

        System.out.println(tekrarEden);
    }
}
