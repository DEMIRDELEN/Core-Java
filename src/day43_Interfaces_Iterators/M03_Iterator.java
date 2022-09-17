package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste); // [10, 20, 30]
        // listedeki tüm elemanları indeks kullanmadan 3 arttırın.

      //  for (Integer each : liste
      //  ) {
      //      each += 3;
      //      System.out.print(each + 3 + " ");
      //  }
      //  System.out.println();
      //  System.out.println(liste);

        /*
        Java indeks yapısı olmayan collection lardaki elementlere ulasmak veya degistirmek icin Iterator interface ini olusturmustur.

        ıterator interface oldugundan ondan obje uretmemiz mumkun degil bunun yerine bize ıterator döndüren liste.iterator() methodunu kullanıyoruz.
         */

        //   Iterator it1 = liste.iterator();
        //   System.out.println(it1.next());
        //   System.out.println(it1.next());
        //   System.out.println(it1.next());
        //ıterator da geri donus yok, adım adim sona ulastıktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmamız gerekir.

        Iterator it2 = liste.iterator();
        // yeni it2 yi kullanarak listenin tum elementlerini silelim.
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();

        System.out.println();
        System.out.println(it2);
        System.out.println(liste);

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

        Iterator it3 = liste.iterator();

        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }

        System.out.println(it3);
        /*
        goruldugu gibi ıterator kullanarak yapabildigim
        1- tum collection elementlerini yazdırmak
        2- tum collection elementlerini silmek
         bu da bize yetmez
         */

    }
}
