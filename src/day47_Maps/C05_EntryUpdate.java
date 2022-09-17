package day47_Maps;

import day46_Maps.Reuseable_Methods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        // soy ismi can olanların bransını datascience yapalım
        Map<Integer, String> siniflistMap = Reuseable_Methods.mapOlustur();

        Set<Map.Entry<Integer, String>> entryseti = siniflistMap.entrySet();

        String entryvalue;
        String entryarr[];
        for (Map.Entry<Integer, String> entry : entryseti
        ) {
            entryvalue = entry.getValue();
            entryarr = entryvalue.split(", ");

            if (entryarr[1].equals("Can")) {
                entryarr[2] = "DataScience";
                entryvalue = entryarr[0] + ", " + entryarr[1] + ", " + entryarr[2];
            }

            entry.setValue(entryvalue);
        }
        System.out.println(siniflistMap);
    }

}
