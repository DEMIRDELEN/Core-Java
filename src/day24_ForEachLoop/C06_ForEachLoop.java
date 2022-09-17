package day24_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,3,4,6,23,6,8,9,1};
        List<Integer> liste= new ArrayList<>();

        // array deki tum elemanları inceleyelim tek sayi olanlari liste atalım

        for (int each: arr // gelecek dataların türü loop icinde ne isim verdigim ve nerden aldıgım
             ) {
            if (each%2==1){
                liste.add(each);
            }
        }
        System.out.println(liste);
    }
}
