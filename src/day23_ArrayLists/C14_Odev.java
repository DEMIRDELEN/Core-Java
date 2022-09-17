package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C14_Odev {
    public static void main(String[] args) {

        String isimler[] = {"ali", "buse", "civan", "derya", "erdogan"};

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen istenmeyen harfi girin");

        String harf = scan.nextLine().toLowerCase().substring(0, 1);

        List<String> kalanlar = new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {
            if (!isimler[i].contains(harf)) {
                kalanlar.add(isimler[i]);
            }
        }

        String newArray[] = new String[kalanlar.size()];

        for (int i = 0; i < kalanlar.size(); i++) {
            newArray[i] = kalanlar.get(i);
        }

        System.out.println(Arrays.toString(newArray));
    }
}
