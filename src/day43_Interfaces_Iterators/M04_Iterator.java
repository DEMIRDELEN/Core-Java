package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_Iterator {
    public static void main(String[] args) {
        /*
        ListIterator ıterator ınterface inin child interface idir ama daha çok method a sahiptir.
         */
        List<Integer> liste = new ArrayList<>();

        liste.add(10);
        liste.add(20);
        liste.add(30);

        ListIterator it1 = liste.listIterator();
        Integer temp;
        while (it1.hasNext()) {
            temp = (Integer) it1.next()+3;
            it1.set(temp);
        }
        System.out.println(liste);
    }
}
