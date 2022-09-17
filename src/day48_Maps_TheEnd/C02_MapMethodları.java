package day48_Maps_TheEnd;

import day46_Maps.Reuseable_Methods;

import java.util.Map;

public class C02_MapMethodları {

    public static void main(String[] args) {
        Map<Integer, String> sinifListMap = Reuseable_Methods.mapOlustur();

        Reuseable_Methods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.getOrDefault(104, "aradığınız key yok"));
        System.out.println(sinifListMap.getOrDefault(110, "aradığınız key yok"));

        System.out.println(sinifListMap.isEmpty());
        sinifListMap.putIfAbsent(104, "Derya, Okyanus, Developer");
        sinifListMap.putIfAbsent(108, "Aysun, Can, Devops");
        Reuseable_Methods.entryYazdir(sinifListMap);


        // siniflistesimap e 106, "mevlut, han, tester" ekleyin- 106 daha once varsa "eski degeri degistirmek ister misiniz yazdirin?

        // key varsa ekleme yapmaz ve bize o key ile kayıtlı olan value yu getirir.
        // key yoksa ekleme yapar ve bize null dondurur.

        if (sinifListMap.putIfAbsent(109,"Mevlut, Han, Tester")==null){
            System.out.println("kayıt başarılı");
        }else {
            System.out.println("eski değeri degistirmek istediginizden emin misiniz?");
        }

        Reuseable_Methods.entryYazdir(sinifListMap);

        sinifListMap.remove(106); // 106 yı siler ve bana sildigi şeyi dondurur
        System.out.println();
        sinifListMap.replace(105,"erdal, Ciftci, Tester");
        Reuseable_Methods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size());
    }
}
