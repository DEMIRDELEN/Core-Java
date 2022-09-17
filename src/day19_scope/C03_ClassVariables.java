package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {

        /*
        farklı bir class da çalışırken herhangi bir class adını yazıp noktaya basarsak adını yazdığımız clastaki tüm static
        klas üyelerini görebilir ve kullanabiliriz
         */
        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi);//10
        System.out.println(C02_StaticVariables.degersizStaticVar);// 0
        /*
        not: class level variable lara değer atayıp atamamak bize kalmıştır , istersek deger atarız, istemezsek değer atamayız

        eğer deger atamıssak java atadıgımız o degeri kabul eder, deger atamazsak o zaman java bu
        variable lara default bir deger atamasi yapar.
        int--> 0
        string-> null
        boolean--> false
        charr-->'' (hiclik)
         */


        /*
        başka classtaki instance variable lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1= new C02_StaticVariables();
        obje1.staticOlmayanMethod(); //10
        //bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim);
        System.out.println(obje1.degersizInstanceVariable);

        System.out.println(C02_StaticVariables.staticSayi);

        /*
        farklı bir classtan c02 clasından method ve variable ları
        kullandığımda c02 clasının tamamı değil sadece benim cagırdığım kısım class uyeleri calisir
         */
    }
}
