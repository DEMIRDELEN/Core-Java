package day24_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde ikiyüz tane 1000 den kucuk pozitif tam sayi olan bir list olusturun,
        kullanıcıdan bir sayi isteyip listede var olup olmadıgını kullanıcıya yazalım
         */

        Random rnd = new Random();
        int sayi = 0;

        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)) {
                sayiListesi.add(sayi);
            }
        }

        boolean bildiMi = false;
        int tahminSayisi=1;

        Scanner scan=new Scanner(System.in);

        while (!bildiMi){
            System.out.println("lutfen tahmin sayinizi yazin");
            sayi= scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("bildin helalke "+ tahminSayisi+ " adet tahminde buldun");
                bildiMi=true;
            } else {
                System.out.println(tahminSayisi+" adet sayı söylediniz ama hiç biri listede yok");
                tahminSayisi++;
            }
        }

    }
}
