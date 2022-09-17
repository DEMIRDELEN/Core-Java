package day12_StringManipulation;

import java.util.Scanner;

public class C15_Odev {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin.
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen 3 karakterli isim girin");

        String str = scan.nextLine();

        if (str.length() == 3) {
            if (str.substring(2,3).equals(str.substring(0,1)) && str.substring(1,2).equals(str.substring(2,3))){
                System.out.println("isim aynı karakterlere sahiptir");
            }else {
                System.out.println("dizenin benzersiz karakterleri var");
            }
        } else {
            System.out.println("uzunluk 3 karakter olmalıdır.");
        }
    }
}