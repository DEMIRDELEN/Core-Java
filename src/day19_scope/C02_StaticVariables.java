package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;

    int degersizInstanceVariable;
    /*
    class leveldaki variable lara deger atamasak da java kabul ediyor
     */



    public static void main(String[] args) {
        /*
    bir variable static oluşturulduysa objeler için değil class için geçerlidir.
     */
        System.out.println(staticSayi);
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi);
        C02_StaticVariables obje1= new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);
        /*
        instance bir variable nin değerini bulmak için objenin
        oluşturulmasından itibaren istenen satıra kadar kodu takip etmeliyiz

        static variable da ise class ın en başından başlayarak istenen
        satıra kadar kodu takip edip static variable ın son değerini
        bulmamız gerekir
         */

    }
    public static void staticMethod(){
        System.out.println(staticSayi);
    }
    public void staticOlmayanMethod(){
        /*
        static variable lar class içerisinden her yerden ulaşılabilir
        static olsun veya olmasın tüm methodlar static variable ları görebilir ve değiştirebilir
        farklı methodlarda static variable ın hangi degeri alacağını bilmek istiyorsak
        class ın basindan itibaren kodun calısmasını istiyorsak classın basından itibaren kodun çalışmasını takip etmeliyiz
method ne zaman cagrilirsa o anki static variable degerini method da kullanabiliriz
         */

        System.out.println(staticSayi);
        staticSayi=20;

    }
}
