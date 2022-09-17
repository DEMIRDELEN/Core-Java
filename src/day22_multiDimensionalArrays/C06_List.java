package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
        array in array yapan sembol [] idi, arrayList de ise <> diamond (elmas) kullanırız.

         */

        List<String> isimler = new ArrayList<>();

        System.out.println(isimler); // []

        // bir liste eleman eklemek istersek

        isimler.add("Basak");

        System.out.println(isimler.add("ayse"));

        isimler.add(1,"cavit");

        isimler.add(1,"kerim");

        System.out.println(isimler);

        /*
        stringde bir metod çalıştırınca assign yapmazsak string degismiyordu

        String isim="suleyman";
        isim.toUpperCase(); // sadece bu satır için SULEYMAN
        sout(isim)--> suleyman

        list in tek kötü yanı array alt yapısını kullandığı için elemanları birer birer eklemek zorunda olmamız
         */
    }
}
