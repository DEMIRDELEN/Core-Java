package day36_InheritanceDataTypeKullanımı;

import day35_InheritancedaConstructorKullanımı.Matematikciler;

import java.util.ArrayList;
import java.util.List;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;


    protected void maas() {
        System.out.println("Memurlar: " + (30 * gunlukMesai * saatUcreti) + " maas alır.");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar yüzde 60 indirimli ozel sigorta yaptırabilir.");
    }

    public static void main(String[] args) {

        CMemur memur1 = new CMemur();

        System.out.println(memur1.gunlukMesai);
        System.out.println(memur1.saatUcreti);
        memur1.maas();
        memur1.ozelSigorta();
        memur1.sigorta();
        System.out.println(memur1.isim);
        System.out.println(memur1.soyİsim);
        System.out.println(memur1.departman);

        BMuhasebe muhasebe = new BMuhasebe();
        /*
        her ne kadar memur class ının icinde olsam da olusturdugum obje muhasebe class ından,
        cunku data turu ve constructor BMuhasebe


        String str = "murat";
        List<Integer> List = new ArrayList<>();
        Integer sayi = 20;

        BMuhasebe class ı da obje olusturulabilen bir classdır ve aynı zamanda bir data turudur.
         */

        System.out.println(muhasebe.gunlukMesai);
        System.out.println(muhasebe.saatUcreti);
        muhasebe.maas();
        muhasebe.ozelSigorta();
        muhasebe.sigorta();
        System.out.println(muhasebe.isim);
        System.out.println(muhasebe.soyİsim);
        System.out.println(muhasebe.departman);
    }

}
