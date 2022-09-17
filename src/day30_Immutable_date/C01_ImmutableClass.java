package day30_Immutable_date;

import java.util.ArrayList;
import java.util.List;

public class C01_ImmutableClass {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("kenan");
        list.add("enes");
        list.add("Ismail");
        System.out.println(list);
        list.set(1, "yasemin");
        System.out.println(list);
        list.remove("Ismail");
        System.out.println(list);
    }
}
