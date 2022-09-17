package day46_Maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, Developer");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, Javaci");
        sinifList.put(104, "Derya, Deniz, Tester");

        System.out.println(sinifList);
        System.out.println(sinifList.keySet());
        System.out.println(sinifList.values());
        System.out.println(sinifList.values().size());

        // tum ogrencilerin isim ve soy isimlerini alt alta yazdirin.

        Collection<String> tumValueCollection = sinifList.values();
        String eachArr[];
        int sira = 1;
        for (String each : tumValueCollection
        ) {
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;
        }
        System.out.println("----------------------------------------------------------------------");

        List<String> sinifIsimSoyisim = new ArrayList<>();

        for (String each : tumValueCollection
        ) {
            eachArr=each.split(", ");

            sinifIsimSoyisim.add(eachArr[0]+" "+eachArr[1]);
        }

        System.out.println(sinifIsimSoyisim);

    }
}
