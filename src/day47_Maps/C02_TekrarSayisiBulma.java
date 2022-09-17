package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {

        // verilen bir stringdeki kullanılan harfleri ve kullanılan harflerin tekrar sayisini h=20 şeklinde yazdirin.
        // spaceleri ssaymasın noktayı saymasın

        String str = "Heeeeellllooooo Woooorrrrllllllddddd.";

        str = str.replaceAll("\\W", "");

        String harflerarr[] = str.split("");

        Map<String, Integer> tekrar = new HashMap<>();

        for (String each : harflerarr
        ) {
            if (tekrar.containsKey(each)) {
                tekrar.put(each, tekrar.get(each)+1);
            } else {
                tekrar.put(each, 1);
            }
        }
        System.out.println(tekrar);
    }
}
