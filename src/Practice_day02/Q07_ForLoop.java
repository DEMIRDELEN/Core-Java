package Practice_day02;

import java.util.Scanner;

public class Q07_ForLoop {
    public static void main(String[] args) {
        /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir harf girin");

        String harf=scan.next().toLowerCase();

        String sesli="aeıioöuü";


        if (sesli.length()==1 && sesli.contains(harf)){

                System.out.println("harf sesli harf");

        } else {
                System.out.println("tek harf değil ya da sesli harf değil");
        }
    }
}
