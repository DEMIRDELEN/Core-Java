package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_multiDimensionalArrays {
    public static void main(String[] args) {

        // tek katlı arraylerde array i direk yazdıramıyoruz çünkü array non-primitive data
        // türüdür ve her non-primitive data türü direk yazdırılamayabilir.

        //ancak array in ierisindeki elementleri direk yazdırabiliriz. cünkü genelde primitivi data
        // türü veya string elementler kullanılıyordu.

        //multi dimensional arraylerde en dikkat edeceğimiz konu ulasmak istedigimiz elementin bir array mı yoksa
        //primitive data mı oldugudur

        int sayilar[][]={{1,2,4,5},{3,4}};



        //burada sayilar arrayini düşünürsek icinde 2 tane inner array var, sayilar[0] ==> [1,2,4,5]
        //ancak en içerdeki elementlere ulaşırsak direk yazdırabiliriz

        System.out.println(sayilar[0]); // [I@3ac3fd8b
        System.out.println(Arrays.toString(sayilar[0])); //[1, 2, 4, 5]
        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));// [[I@3ac3fd8b, [I@5594a1b5]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        array i iki şekilde deklare ederiz
        1- elemanları direk yazarak
        int sayilar[][]={{1,2,4,5},{3,4}};

        2- outer ve inner arraylerin uzunluklarını belirterek oluşturabiliriz
        int sayilar[][]=new int[3][4];

        ancak 2. yöntemle yaptığımızda inner arraylerin farklı uzunlukta olma ihtimali kalmaz
        bu örnek için outer array in 3 tane inner array i vardır, her bir inner arrayin ise 4 er elemanı vardır

        eger inner arrayleri farklı uzunlukta olusturmak istiyorsanız mecburen ilk yöntemi kullanmalısınız
         */
    }
}
