package day35_InheritancedaConstructorKullanÄ±mÄ±;

public class HCorolla extends GToyota{

    HCorolla () {
        System.out.println("HCorolla parametresiz consturactor");
    }
    HCorolla (String isim) {
        super(isim);
        System.out.println("HCorolla parametreli constructor");
    }
}
