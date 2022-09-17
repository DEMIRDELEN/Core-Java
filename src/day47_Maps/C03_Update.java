package day47_Maps;

import day46_Maps.Reuseable_Methods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {

        /*
        map.contains(key) --> bize verdiğimiz key in map da olup olmadığını boolean olarak doner.
        map.contains(value) --> bir butun olarak value nun map de olup olmadıgını döner.

        ÖNEMLİ NOT: map.contains(value) Valunun icindeki bir parcayı bulmada ise yaramaz.
        eger value icindeki bir parcayi aratmak istiyorsak map uzerinde manipulation yapmamız lazim

        map.get(key)--> verilen key e ait degeri dondurur.
        */

        Map<Integer, String> siniflistMap = Reuseable_Methods.mapOlustur();

        System.out.println(siniflistMap);
        System.out.println(siniflistMap.containsKey(104));
        System.out.println(siniflistMap.containsKey(114));

        System.out.println(siniflistMap.containsValue("Ali, Can, Developer"));
        System.out.println(siniflistMap.containsValue("Developer"));

        // verilen map de JD yi javaDeveloper olarak degistirelim.
        // map lerde replace tum value yu degistirmek istersek kullanılabilir. kısmi degisiklikte kullanılamaz.

        // map i guncellemek icin yeni (key, value) yu map e eklemem gerek.
        // guncelleme icin siniflistmap.put(101,Ali, Can, Javadeveloper)
        // bunu yapabilmek icin her bir key a ve ona ait valuya ihtiyacım var

        Set<Integer> key = siniflistMap.keySet();
        String eachValue;
        for (Integer each : key
        ) {
            eachValue = siniflistMap.get(each);
            eachValue=eachValue.replace("Developer","JavaDeveloper");
            siniflistMap.put(each,eachValue);

            /*
            key larin tamamını aldık her bir key in value sunu getirdik ,value uzerinde degisikliği
            yapıp yeni halini put(key, yenideger) ile map e koyduk.
             */
        }
        System.out.println(siniflistMap);
        System.out.println(siniflistMap.keySet());
    }
}
