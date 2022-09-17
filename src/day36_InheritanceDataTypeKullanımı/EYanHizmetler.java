package day36_InheritanceDataTypeKullanımı;

public class EYanHizmetler extends BMuhasebe {

    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;


    protected void maas() {
        System.out.println("Yan hizmetler: " + (30 * gunlukMesai * saatUcreti) + " maas alır.");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan hizmetler yüzde 30 indirimli issizlik sigortası yaptırabilir.");
    }

    public static void main(String[] args) {
        /*
        overriding child class daki bir method un parent class daki aynı isimdeki methodu etkisiz hale getirerek kendisinin spesifik ozelligini ortaya çıkarmasıdır

        overriding i nerede dikkate alıyoruz?

        bir obje olusturulurken data turu ve cons farklı ise

        eger bir obje olusturulurken data turu ve cons farklı ise objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz
        1- obje cons un oldugu class da olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class dan baslarız. bu class da aranan ozellik bulunamazsa parent class a bakılır. orada da yoksa o zaman CTE.

        EGER aranan ozellik variable ise buldugumuz ilk degeri yazdırırız.

        3- aranan ozellik method ise degeri yazdırmadan once override edilmis mi diye kontrol etmemiz gerek. eger override edildiyse en guncek degeri yazdirir.
         */

        BMuhasebe yh1 = new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); // M-8
        System.out.println(yh1.saatUcreti); // M-10
        yh1.maas();//EYH
        yh1.ozelSigorta();// M
        yh1.sigorta(); //P
        System.out.println(yh1.isim);//P
        System.out.println(yh1.soyİsim);//P
        System.out.println(yh1.departman);//P
        // System.out.println(yh1.issizlikSigorta);

        //aramaya muhasebeden basladıgımızdan issizliksigortası bulamadık o zaman CTE. bulsaydık override edilmiş mi kontrol ederdik.
    }
}
