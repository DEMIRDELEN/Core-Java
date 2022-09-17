package day12_StringManipulation;

import java.util.Scanner;

public class C17_Odev {
    public static void main(String[] args) {
        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ilk ismi girin");

        String isim1 = scan.nextLine();

        System.out.println("lutfen ikinci ismi girin");

        String isim2 = scan.nextLine();

        if (isim1.trim().length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
        } else {
            System.out.println("isim1, isim2 ye eklenemiyor");
        }
    }
}
