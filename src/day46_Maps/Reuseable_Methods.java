package day46_Maps;

import java.util.*;

public class Reuseable_Methods {

    public static Map<Integer, String> mapOlustur() {

        Map<Integer, String> sinifMap = new HashMap<>();

        sinifMap.put(101, "Ali, Can, Developer");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, Javaci");
        sinifMap.put(104, "Derya, Deniz, Tester");
        sinifMap.put(105, "Enes, Can, Tester");
        sinifMap.put(106, "Taha, Deniz, Javacı");


        return sinifMap;
    }


    public static void tumValueSiraliYazdir(Map<Integer, String> ogrenciMap) {
        int sira = 1;
        for (String each : ogrenciMap.values()
        ) {
            System.out.println(sira + " - " + each);
            sira++;
        }
    }

    public static List<String> IsimSoyisimListesiOlustur(Map<Integer, String> ogrenciMap) {

        List<String> methoddakiList = new ArrayList<>();
        String eachArr[];
        int sira = 1;

        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");
            methoddakiList.add(eachArr[0] + " " + eachArr[1]);
        }
        return methoddakiList;
    }

    public static void BranslariYazdir(Map<Integer, String> ogrenciMap) {
        List<String> branslar = new ArrayList<>();
        branslar.add("BRANŞLAR");
        String eachArr[];
        int sira = 1;
        int varYok = 0;
        for (String each : ogrenciMap.values()
        ) {
            eachArr = each.split(", ");

            for (int i = 0; i < branslar.size(); i++) {
                if ((!branslar.contains(eachArr[2]))) {
                    branslar.add(eachArr[2]);
                }
            }
        }

        for (int i = 1; i < branslar.size(); i++) {
            System.out.println(sira + "- " + branslar.get(i));
            sira++;
        }
    }

    public static void BranslariYazdir1(Map<Integer, String> ogrenciMap) {

        List<String> branslar = new ArrayList<>();
        String[] eachArr;

        for (String each : ogrenciMap.values()) {

            eachArr = each.split(", ");
            branslar.add(eachArr[2].toUpperCase());
        }

        Map<String, Integer> bransMap = new HashMap<>();

        for (int i = 0; i < branslar.size(); i++) {
            if (bransMap.containsKey(branslar.get(i))) {
                bransMap.put(branslar.get(i), bransMap.get(branslar.get(i)) + 1);
            } else {
                bransMap.put(branslar.get(i), 1);
            }
        }

        System.out.println(bransMap);
    }

    public static void bransOgrenciYazdir(Map<Integer, String> sinifListMap) {

        Map<String, Integer> bransMap = new HashMap<>();

        Collection<String> valuesCollection = sinifListMap.values();

        String valueArr[];
        String brans;
        for (String each : valuesCollection
        ) {
            valueArr = each.split(", ");
            brans = valueArr[2];

            if (bransMap.containsKey(brans)) {
                bransMap.put(brans, bransMap.get(brans) + 1);
            } else {
                bransMap.put(brans, 1);
            }
        }
        System.out.println(bransMap);
    }

    public static void entryYazdir(Map<Integer, String> sinifListMap) {

        Set<Map.Entry<Integer, String>> sinifListEntrySeti = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> enrty : sinifListEntrySeti
        ) {
            System.out.println(enrty);
        }
    }
}
