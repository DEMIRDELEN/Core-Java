package day35_InheritancedaConstructorKullanÄ±mÄ±;

public class EMuhasebe extends DPersonel{


    EMuhasebe() {
        System.out.println("muhasebe parametresiz constructor");
    }

    EMuhasebe(String isim) {
        System.out.println("parametreli muhasebe constructor");
    }
}
