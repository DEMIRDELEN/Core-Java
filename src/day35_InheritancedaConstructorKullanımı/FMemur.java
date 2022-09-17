package day35_InheritancedaConstructorKullanımı;

public class FMemur extends EMuhasebe {
    /*
        extend keyword kullanılan class larda ister default cons bulunsun istersek de biz yeni cons.lar olusturalım java
        cons.ın ilk satırına super(); cons call yazar.

        super(); cons call, default cons call default cons benzer. görünmese de orada vardır ve calisir. ancak biz ilk satıra
        farklı bir cons call yazarsak java super(); consu siler.

        Eger biz mudahale edip kendi constructor call umuzu olusturmazsak javanın default olarak olusturdugu constructor call her zaman parametresizdir.
         */
    FMemur() {
        System.out.println("memur parametresiz consturactor");
    }

    FMemur(String isim) {
        System.out.println("memur parametreli constructor");
    }

    public static void main(String[] args) {
        FMemur mmr1 = new FMemur("ali");

    }
}
