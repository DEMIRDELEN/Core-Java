package day43_Interfaces_Iterators;

public interface I01_InterfaceBodyOlanMethod {
    void motor();
    public void yakit();
    public abstract String aku();

    public static final String isim ="veli";

    /*
    normal bir class da oldugumuzu düşünsek iki tane access modifier kullanma ihtimali olamaz.

    asagıdaki method da göreceginiz gibi interface de istisnai olarak body si olan methodlar olusturulabilir.

    bu ozellik java 8 den sonra gelmiştir. önceden bir interface e yeni bir method eklememiz gerektiginde, eskiden beri bu interface ı implemenet
    eden tum classlara gidip yeni eklenen methodu override etmemiz gerekirdi.

    bu özellik sayesinde basına default veya static keyword ekleyerek interface de yeni ve bodysi olan bir method olusturursak bu method un child
    class lar tarafından override edilme mecburiyeti olmaz ve eskiden implement etmiş class ları degistirmemiz gerekmez.

    bu methodların body si olsa da bu methodlara concrete method denmez ama override edilme mecburiyetleri yoktur.

    buradaki default kelimesi acces modifier değil, istisnai durumun belirtilmesi içindir.

    o zaman nicin 2 keyword (static ve default) tanımlanmıstır.
    bu iki farklı kelimenin amacı child classlardan bu methoda nasıl erisilebilecegini belirlemek icindir.
    static keyword kullanılırsa, child class lardan bu method a erismek icin ınterfaceAdı.MethodAdi yeterli olur.
    default keyword kullanılırsa methoda erismek icin obje olusturulmalıdır.
     */

    public default void teker() {
        System.out.println("default....her arabanın tekeri vardır");
    }
    public static void direksiyon(){
        System.out.println("static....her arabanın direksiyonu vardır");
    }
}
