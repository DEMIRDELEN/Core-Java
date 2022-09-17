package day36_InheritanceDataTypeKullanımı;

import java.util.*;

public class DIsci extends BMuhasebe {
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;


    protected void maasIsci() {
        System.out.println("Isci: " + (30 * gunlukMesai * saatUcreti) + " maas alır.");
    }

    protected void ozelSigortaIsci() {
        System.out.println("Isciler yüzde 70 indirimli ozel sigorta yaptırabilir.");
    }

    public static void main(String[] args) {

        BMuhasebe isci = new DIsci();
        /*
        bir obje olusturulurken data türü ve cons aynı class dan ise direk o class a gidiyorduk yoksa parent a.

        eger data turu ve cons farklı ise Obje cons un oldugu class ın objesidir. ancak bizden istenen Isci class ındaki ozellikler spesifik ozellikler degil,
        bir iscinin muhasebe class ınadki tum calısanlarla beraber sahip oldugu genel ozellikkerli yazdırır.
         */

        System.out.println(isci.gunlukMesai); // M-8
        System.out.println(isci.saatUcreti); // M-10
        isci.maas();//M-
        isci.ozelSigorta();// M
        isci.sigorta(); //P
        System.out.println(isci.isim);//P
        System.out.println(isci.soyİsim);//P
        System.out.println(isci.departman);//P
        System.out.println("");

        APersonel isci1 = new DIsci();

        //  System.out.println(isci1.gunlukMesai); // CTE
        //  System.out.println(isci1.saatUcreti); // CTE
        isci1.maas();//M-
        // isci1.ozelSigorta();// CTE
        isci1.sigorta(); //P
        System.out.println(isci1.isim);//P
        System.out.println(isci1.soyİsim);//P
        System.out.println(isci1.departman);//P

        /*
        EGER data turu olan class da aradıgımız ozellik yoksa,varsa onun parent ına gidebilir ancak child a donuş olmaz.
        aradıgı ozelligi bulamazsa CTE verir.

         */

        List<String> list = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
    }

}
