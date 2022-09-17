package day39_Exceptions;

import java.io.FileInputStream;

public class C03_Exceptions {
    public static void main(String[] args) {

        String str ="12345";

        int sayi = 0;

        try {
            sayi = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("deger sadece rakamlardan olusmalıdır.");
        }catch (Exception e) {
            System.out.println("ongorulemeyen bir hata olustu");
        }

        String str2= String.valueOf(sayi);

        System.out.println(str);
        System.out.println(sayi);
        System.out.println(str2);
        System.out.println("");

        System.out.println("sayinin karesi: "+ sayi*sayi);

        // String str3=3; (direk cte)
        /*
        kullanıcıdan string olark bir deger alıyor ve bunu ınteger a ceviriyorsak. NumberFormatException ile karsılasabileceğimizi ongoruruz.
        NFE aldıgımızdakodun durmamasını istiyorsak try catch ile cevreleyebiliriz.

        eger bilmediğim bir exception daha olusursa kodum durmasın istiyorsak
        bir kere daha catch cumlesi ekleyip ona en genis exception ı yazabiliriz.
         */

    }
}
