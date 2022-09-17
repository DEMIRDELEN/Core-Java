package day34_Inheritance;

public class İsci extends Personel {
    /*
    normal hayatımızda parent cocuk sahibi olaya karar verebilir.

    javada ise child class lar ozelliklerini Inherit etmek istedikleri class ı kendilerine
    parent edinirler.

    mesela isci class ını olusturunca nelere ihtiyacı var diye dusunsek personel class ınadki tum
    variable ve methodlara ihtiyacı oldugunu gorebiliriz.
    Bu durumda yeniden o variable ve methodları olusturmak yerine personel class ını kendimize
    parent ediniriz.

    bir class ı parent edinmek icin extends keyword kullanmalıyız.

    bir class baska bir class ı parent edindiginde
    1- parent class daki tum ozelliklere (variable + method) sahip olur.
    2- parents class daki özelliklerdem bazılarını kendine uyarlayabilir.
    3- parent class da olmayan bazı yeni ozellikler olusturabilir.
    not: parent class daki ozelliklerden hic birini reddemez ama degistirebilir.
     */
    int personelNo = 1001;


    public static void main(String[] args) {

        İsci isci1 = new İsci();

        System.out.println(isci1.isim);
        // kendi class ımızda isim yok o yüzden parent a gittik.
        isci1.isim = "selim";

        System.out.println(isci1.personelNo);

        isci1.maas(); // tum personelin maasi vardir. - isciler minimum 15 euro saat ücreti alır.
    }

    public void maas(){
        System.out.println("isciler minimum 15 euro saat ücreti alır.");
    }

    public void OzelSigorta (){
        System.out.println("iscilerden isteyene %50 indirimli sigorta yaptırılır.");
    }
}
