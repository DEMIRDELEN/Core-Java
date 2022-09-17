package day19_scope;

public class C01_İnstanceVariables {

    /*
    class içinde her yerde kullanmak istediğiniz variable ları class
    levelda (classın içinde ama methodların dışında), genellikle class
    level variableler class ın başında oluşturulur

   class level daki variable lar için iki scope vardır
   1- static variables(class variable ları)
   2-instance (static olmayan) variables (obje variable ları da denir)
     */

    int instSayi=20; // static olmayıp class levelda olduu için instance variable dır.

    public static void main(String[] args) {
        int sayi=10;

        /*System.out.println(instSayi);
         instance variable static olmadığı için static kulübe üye main metoddan direk kullanamayız
         instance variableların diğer adı object variabledır
         dolayısıyla oble oluşturursanız instance variableleri her yerden kullanabilirsiniz
         */

        C01_İnstanceVariables obje1= new C01_İnstanceVariables();
        System.out.println(obje1.instSayi);// 20
        obje1.instSayi=30;
        System.out.println(obje1.instSayi);// 30

        C01_İnstanceVariables obje2= new C01_İnstanceVariables();
        System.out.println(obje2.instSayi);// 20
        obje2.instSayi=25;
        System.out.println(obje2.instSayi);

        C01_İnstanceVariables obje3= new C01_İnstanceVariables();
        System.out.println(obje3.instSayi);
        /* her obje oluştuğunda instance (obje) variablenin ilk atanan değerini alır

         */


    }

    public static void staticMethod(){
        //System.out.println(sayi);
        /*
        bir method içinde oluşturulan variable
        sadece o methodun içinden kullanılabilir (locale variable)
         */

       /*
        instsayi=30;

        instance variable lara main metod dışındaki static metodlardan da direk ulaşılamaz.
        obje oluşturursak ulaşabiliriz.
        */

        C01_İnstanceVariables obje4= new C01_İnstanceVariables();
        System.out.println(obje4.instSayi);// 20

    }

    public void staticOlmayanMethod(){

        System.out.println(instSayi);
        /*
        instance variable lar class içerisindeki static olmayan metodlardan direk kullanılabilir.
         */

    }
}
