package day36_InheritanceDataTypeKullanımı;

public class BMuhasebe extends APersonel{

    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;

    protected  void  maas(){
        System.out.println("personel minimum: "+ (30*gunlukMesai*saatUcreti)+ " maas alır.");
    }

    protected  void  ozelSigorta(){
        System.out.println("isteyen calisanlara yüzde 50 indirimli ozel sigorta yapılır.");
    }
}
