package day34_Inheritance;

public class Personel {
    /*
    eger parent class olacak sekilde tasarladıgınız bir class varsa veya ilerde bu class ı parent
    yapmak isteyenler olabilir diyorsanız o zaman variable ve methodların access modifier'ını
    protected
     */

    int personelNo;
    protected String isim = "Isim belirtilmedi.";
    protected String departman = "Departman belirtilmedi.";


    protected void maas(){
        System.out.println("tum personelin maası vardir.");
    }

    protected void mesai(){
        System.out.println("tum personel statusune gore mesai yapar.");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("personel fazla mesai ucretini statusune gore alır.");
    }
}
