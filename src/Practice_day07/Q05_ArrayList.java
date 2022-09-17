package Practice_day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q05_ArrayList {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();
        isimler.add("enes");
        isimler.add("ısmail");
        isimler.add("abdulbaki");
        isimler.add("emre");
        isimler.add("melisa");
        isimler.add("oguz");

        System.out.println("isimler = " + isimler);

        System.out.println("lutfen isminizi girin");
        String isim = scan.nextLine().trim();

        boolean usernameVarMi = isimler.contains(isim);

        if (!usernameVarMi) {
            isimler.add(isim);
            System.out.println("isim alınabilir ve kaydedildi");
        } else {
            System.out.println("bu kullanıcı zaten alınmıstır");
        }

        if (usernameVarMi) {
            int randomSayi = new Random().nextInt(100);
            isim = isim + "" + randomSayi;
            System.out.println("yeni kullanici adiniz :" + isim);
            isimler.add(isim);
            System.out.println("databaseIsimler = " + isimler);
        } else {
            System.out.println("yeni kullanici adiniz :" + isim);

        }
    }
}