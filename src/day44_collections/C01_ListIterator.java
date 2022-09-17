package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        System.out.println(liste);

        ListIterator li1 = liste.listIterator();
        int bas=20;
        int bitisSinir=40;
        while (li1.hasNext()){
            int temp= (Integer) li1.next();
            if (temp<20 || temp>40){
                li1.remove();
            }
        }
        System.out.println("liste = " + liste);
    }
}
