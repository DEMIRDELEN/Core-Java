package day35_InheritancedaConstructorKullanımı;

public class GToyota {

    GToyota () {
        System.out.println("GToyota parametresiz consturactor");
    }
    GToyota (String isim) {
        // super(isim); extends olmadıgı icin super cons call u java kabul etmez.
        System.out.println("GToyota parametreli constructor");
    }


}
