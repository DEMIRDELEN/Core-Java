package day23_ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C18_Odev {
    public static void main(String[] args) {
        /*
        7- Array i ARRAYLIST e çeviren Java Kodunu yazınız.
Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
Beklenen Çıktı:
[Python, JAVA, PHP, Perl, C#, C++]
         */

        String array [] = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
        List<String> isimler=new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            isimler.add(array[i]);
        }

        System.out.println(isimler);


    }
}
