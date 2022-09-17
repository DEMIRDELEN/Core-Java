package day35_InheritancedaConstructorKullanımı;

public class Bparent extends AGrandParent {

    protected String isim = "Parent isim belirtilmedi.";
    protected String parentKulupAdi = "Parent Kulubu";


    Bparent() {
        System.out.println("Parent constructor calisti.");
    }
}
