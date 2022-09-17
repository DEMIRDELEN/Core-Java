package day24_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemanlarıBulma {
    public static void main(String[] args) {
       // Soru 3:
       // iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
       // each loop
       // kullanarak bulunuz. Sonucu ekrana yazdiriniz
        // Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz

        String arr1[]={"ali","veli","can","ayse"};
        String arr2[]={"ali","hasan","ayse","enes"};

        List<String> ortakİsimler= new ArrayList<>();

        for (String each1: arr1
             ) {
            for (String each2: arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakİsimler.add(each1);
                }

            }

        }

        if (ortakİsimler.isEmpty()){
            System.out.println("hiç ortak eleman yok");
        }else {
            System.out.println(ortakİsimler);
        }
    }
}
