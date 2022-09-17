package day29_PassByValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        int sayi=5;
        /*
        bir list olusturalım
        iki ayrı methoddan birinde sadece elemanları degistirelim,
        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim
        ve her iki method call dan sonra kendi listemizi main method icinde kontrol edelim
         */
        List<String> list = new ArrayList<>();

        list.add("ali");
        list.add("veli");
        list.add("can");

        System.out.println("ilk başta list: "+ list);

        elemanlarıDegistir(list,sayi);

        System.out.println("eleman degisim method sonrası: "+ list);

        listdegistirMethodu(list);

        System.out.println("list degistir method sonrası: "+ list);

        System.out.println(sayi);
    }

    public static void listdegistirMethodu(List<String> list) {
        list=new ArrayList<>();
        list.add("nutella");
        list.add("çay");
        list.add("cokokrem");

        System.out.println("list degistir methodunda: "+ list);
    }

    public static void elemanlarıDegistir(List<String> list, int sayi) {

        sayi=10;
        list.set(0,"oguz");
        list.set(1,"murat");
        list.set(2,"fatih");

        System.out.println("eleman degistir methodunda: "+ list+" "+sayi);
    }
}
