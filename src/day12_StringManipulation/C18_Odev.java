package day12_StringManipulation;

import java.util.Scanner;

public class C18_Odev {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim girmesini isteyin
        ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

        Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

                INPUT : Mustafa

        OUTPUT : fafafa
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen bir ismi girin");

        String isim = scan.nextLine();

        String tekrar= isim.substring(isim.length()-2);

        String uclu= tekrar+tekrar+tekrar;

        System.out.println(uclu);

    }
}
