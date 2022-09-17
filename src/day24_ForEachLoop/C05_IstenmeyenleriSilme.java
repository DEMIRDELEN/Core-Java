package day24_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSilme {
    public static void main(String[] args) {

        String sehirler[]={"istanbul","ankara","mersin","konya","kastamonu"};
        String IstenmeyenHarf="r";

        List<String> kalanlar= new ArrayList<>();

        for (int i = 0; i < sehirler.length ; i++) {
            if (!sehirler[i].contains(IstenmeyenHarf)){
                kalanlar.add(sehirler[i]);
            }
        }
        //loop bittiginde istenmeyen harf icermeyen sehirler listeye eklenmis olacak
        System.out.println(kalanlar);

        //yeni bir array olusturup listeyi ona aktaralım

        String kalanlarArrayi[]= new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length ; i++) {
            kalanlarArrayi[i]=kalanlar.get(i);
        }
        sehirler=kalanlarArrayi;

        System.out.println(Arrays.toString(sehirler));
    }
}
