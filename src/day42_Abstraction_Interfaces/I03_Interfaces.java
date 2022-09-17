package day42_Abstraction_Interfaces;

public interface I03_Interfaces {

    int SAYI=20;
    /* int sayi;
    ınterfacelerde tum variable lar public static ve final dır. Dolayısıyla sonradan deger atama sansımız yoktur.
    Bunun icin variable olusturdugumuzda mutlaka deger atamalıyız.
     */

    void yakit();
    /*
    ınterface içerisinde her method public abstract  ozelliklerine sahiptir.

    abstract bir methodun body si olması mümkün degildir. Java sonradan developerların istegi uzerine bir kısmi update yapmıştır.
    Bir interface e sonradan bir abstrack method eklerseniz o interface i daha once implement etmiş tum classlara gidip hepsinde yeni eklenen methodu override etmeniz gerekir.
    Bu da buyuk ve eskiden gelen projeler icin çok zor bir islemdir. Bunun icin java, java 8 den itibaren interfacelere sonradan body si olan method eklenmesine izin vermistir.
    Bu methodların body si olsa da interface in yapısı geregi bu methodlara concrete denmez. Bu body si olan bu methodlar istisna olarak kabul edilir.
     */
    public void motor();
    public abstract void teker();

    static public void aku(){
        // javanın pansuman çözümü hem concrete degil hem abstract degil.
    }
}
