package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        collections <data turunu> object secmeniz durumunda collection a farklı data turlerinden objeler koymanıza izin verir.
        Bu depolama acısından bize esneklik saglar ancak islem yaparken tum objeleri object olarak tanımladıgımızdan cok fazla casting yapmamız gerekebilir.
         */
        List<String> liste = new ArrayList<>();
        //liste.add(5);
        //liste.add('5');
        //liste.add(true);

        List<Object> liste1 = new ArrayList<>();
        liste1.add(5);
        liste1.add('s');
        liste1.add(true);
        liste1.add("ali");

        System.out.println(liste1);

        Set<Object> set1 = new HashSet<>();

        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}
