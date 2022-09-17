package day35_InheritancedaConstructorKullanımı;

public class KDizel extends HCorolla {

    KDizel() {
        System.out.println("KDizel parametresiz consturactor");
    }

    KDizel(String isim) {
        super(isim);
        System.out.println("KDizel parametreli constructor");
    }

    public static void main(String[] args) {
        KDizel arc1 = new KDizel("dizel");
    }
}
