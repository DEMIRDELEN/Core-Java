package day23_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C12_Odev {
    public static void main(String[] args) {

        //verilen array deki uniq elementleri yeni bir array olarak donduren method

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        List<Integer> yeniSayilar=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.indexOf(sayilar.get(i)) == sayilar.lastIndexOf(sayilar.get(i))) {
                yeniSayilar.add(sayilar.get(i));
            }
        }

        System.out.println(yeniSayilar);
    }
}
