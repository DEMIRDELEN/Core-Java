package day27_StaticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam = 5;

    public static void main(String[] args) {

        /*
        statik variable ların diger adı class  variable ıdır, instance ise obje variable dır.
        statik variable-class  variable
        instance-obje variable

        statik variable lar tum classtan kullanılabilirken
        instance olanlar statik olmayan methodlardan kullanılabilir

       instance variable lara static method dan ulasmak icin obje olusturmamız gerek

       instance variable lar obje variable ı oldugu icin herhangi bir satırda instance variable ın degerinin ne oldugunu bulmak icin
       OBJE OLUSTURULAN SATIRDAN itibaren kodincelenmelidir

       static variable lar class variable ı oldugu icin herhangi bir satırda static variable ın degerini bulmak icin
       CLASS IN BASINDAN itibaren kod incelenmelidir.
         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri: " + obj1.rakam);
        System.out.println("obj1'in sayi degeri: " + sayi);

        obj1.rakam += 1;
        sayi += 1;

        System.out.println("obj1'in rakam degeri + 1 : " + obj1.rakam);
        System.out.println("obj1'in sayi degeri + 1 : " + sayi);

        C01 obj2 = new C01();
        System.out.println("obj1'in rakam degeri: " + obj2.rakam);
        System.out.println("obj1'in sayi degeri: " + sayi);

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("obj2'in rakam degeri + 1 : " + obj2.rakam);
        System.out.println("obj2'in sayi degeri + 1 : " + sayi);



    }
}
