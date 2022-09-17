package day35_InheritancedaConstructorKullanımı;

public class HCorolla extends GToyota{

    HCorolla () {
        System.out.println("HCorolla parametresiz consturactor");
    }
    HCorolla (String isim) {
        super(isim);
        System.out.println("HCorolla parametreli constructor");
    }
}
