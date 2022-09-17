package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static <list> void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        /*
        list primitive data türlerini kabul etmez (Type argument cannot be of primitive type)
         */

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar);

        //Sadece add() kullanırsak java sona ekler

        sayilar.add(2,10);

        //add(index, element) istediğğimiz index e istedigimiz elementi yerlestirir
        //add metodu eski elementleri silmez veya uptdate etmez, yeni element ekler

        System.out.println(sayilar);

    }
}
