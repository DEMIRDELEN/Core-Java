package day35_InheritancedaConstructorKullanımı;

public class CChild extends Bparent {

    String isim = "Child isim belirtilmedi.";
    protected String childKulupAdi = "Child Kulubu";

    CChild() {
        System.out.println("Child constructor calisti.");
    }

    public static void main(String[] args) {

        AGrandParent gp1 = new AGrandParent();
        // bu objeyi olusturmak icin grandpa constructor calisir.
        // parent veya child cons calismaz.

        CChild child1 = new CChild();
        child1.grandpaKulupAdi = "child";
        child1.parentKulupAdi = "child2";

        // child1 objesi icin hangi child constructor calisti
        /*
        javada bir class ı kullanabilmek icin o class dan obje olusturur,
        dolayısıyla o class ın constructor ını kullanırdık.

        java inheritance da parent class lardaki ozellikleri kullanabilmek icin o class ların constructorlarını
        otomatik calistiran bir yapı kurmustur.

        Ornegin biz child class ında kendi class ımızdan bir obje olusturmak istedigimizde child constructor ını kullanırız
        java child constructor ını gördügünde önce parent ın constructor ını calıstırmam lazım der.

        buradan parent constructor a gider.parent class ında parent constructor ını görünce once bunun parentının yani grandparent
        constructor calismasi gerekir der.
        Boylece extend keyword olmayan class a kadar gider ve oradan baslayarak tum constructorları aşagı dogru calistirir.
         */

    }
}
