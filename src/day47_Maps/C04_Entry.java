package day47_Maps;

import day46_Maps.Reuseable_Methods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        /*
        java Entry<Integer,value> map in icinde bulunan her bir kaydi K=V şeklinde tutar . dolayısıyla herhangi bir entry e ulastıgımızda
        hem key e hem de value ya ulasabilir ve istedigimiz islemleri yapabiliriz.

        entry.getKey() bize key  i getirir
        entry.getValue bize value yu getirir
        entry.setValue valuyu istedigimiz deger olarak update eder.
         */
        Map<Integer, String> sinifListMap = Reuseable_Methods.mapOlustur();

        // her bir elemanı alt alta yazdırın
        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            System.out.println(each);
        }

        System.out.println();

        //map icindeki tester kurs ismini QA olarak degistirelim.
        String eachValue;
        for (Map.Entry<Integer, String> each : sinifEntrySet
        ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester", "QA");
            each.setValue(eachValue);
            System.out.println(each);
        }

    }
}
