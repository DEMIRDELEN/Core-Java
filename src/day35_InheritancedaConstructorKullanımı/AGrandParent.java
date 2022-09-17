package day35_InheritancedaConstructorKullanımı;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi.";
    protected String grandpaKulupAdi = "Grandpa Kulubu";
    /*
    her class da görunmese bile bir constructor vardır. bu class dan obje
    olustumak istedigimizde default constructor devreye girecektir.

    default constructor ı gozlemleyemeyecegimiz icin onun yereine
    kullanılabilecek parametresiz constructor olusturalım.
     */

    AGrandParent() {
        System.out.println("Grandpa constructor calisti.");
    }
}
