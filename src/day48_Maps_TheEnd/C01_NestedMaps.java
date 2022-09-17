package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_NestedMaps {
    public static void main(String[] args) {

        /*
        eger bir elementle ile ilgili tutacağınız bilgiler coksa veya kompleks
        ise bu defa ic ice map kullanmayı tercih edebiliriz

        ic ice map kullandıgımızda

        ornek olarak dunkü mapi maplarden olusan bir map olarak olusturalım

        sinifMap.put(no=101, isim=Ali, soyisim=Can, brans=Developer");
        sinifMap.put(102, "Enes, Cem, Tester");
        sinifMap.put(103, "Taha, Emre, Javaci");
         */
        Map<String, String> ogr101 = new HashMap<>();
        ogr101.put("isim", "Enes");
        ogr101.put("soyisim", "Cem");
        ogr101.put("brans", "Tester");

        Map<String, String> ogr102 = new HashMap<>();
        ogr102.put("isim", "Taha");
        ogr102.put("soyisim", "Emre");
        ogr102.put("brans", "JavaDeveloper");

        Map<String, String> ogr103 = new HashMap<>();
        ogr103.put("isim", "Derya");
        ogr103.put("soyisim", "Deniz");
        ogr103.put("brans", "Devops");

        Map<Integer, Map<String, String>> ogrenciNestedMap = new HashMap<>();
        ogrenciNestedMap.put(102, ogr102);
        ogrenciNestedMap.put(101, ogr101);
        ogrenciNestedMap.put(103, ogr103);

        System.out.println(ogrenciNestedMap);

        Set<Map.Entry<Integer, Map<String, String>>> ogrenciEntrySeti = ogrenciNestedMap.entrySet();

        for (Map.Entry each : ogrenciEntrySeti
        ) {
            System.out.println(each);
        }

        //102 nolu kisinin ismini yazdıralım

        System.out.println(ogrenciNestedMap.get(102).put("isim","veli"));
        System.out.println(ogrenciNestedMap.get(102).get("isim"));



    }
}
