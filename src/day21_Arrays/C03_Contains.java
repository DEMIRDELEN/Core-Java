package day21_Arrays;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        //  Soru 3- Verilen bir array’in istenen bir elemani icerip icermedigini kontrol edip,
        //  bize true veya false sonucu donen bir method olusturun.

        Scanner scan = new Scanner(System.in);

        System.out.println("aradığınız ismi girin");

        String isimler[] = {"basak", "nurullah", "fatih", "adem", "enes"};

        String arananİsim = scan.nextLine();

        boolean sonuc = contain(isimler, arananİsim);

        if (sonuc){
            System.out.println("girilen isim listede var");
        }else {
            System.out.println("girilen isim listede yok");
        }

    }

    public static boolean contain(String[] isimler, String arananİsim) {

        boolean sonucMethod = false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(arananİsim)) {

                sonucMethod = true;
            }
        }

        return sonucMethod;
    }
}
