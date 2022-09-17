package day36_InheritanceDataTypeKullanımı;

public class APersonel {

    protected String isim = "isim belirtilmedi.";
    protected String soyİsim = "soyisim belirtilmedi.";
    protected String departman = "departman belirtilmedi.";

    protected void maas(){
        System.out.println("tum personelimiz maas alir.");
    }
    protected void sigorta(){
        System.out.println("tum personelimize sigorta yapılır.");
    }


}
