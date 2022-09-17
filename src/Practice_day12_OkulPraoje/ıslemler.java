package Practice_day12_OkulPraoje;

import day41_AbstractClass_Interface.EToyota;

import java.util.*;

public class ıslemler {

    static List<kisi> ogretmenList = new ArrayList<>();
    static List<kisi> ogrenciList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.nextLine().toUpperCase();

        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenüsü();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenüsü();
                break;

            case "Q":
                cikis();
                break;

            default:
                System.out.println("hatalı giriş..");
                girisPaneli();
                break;
        }
    }

    public static void islemMenüsü() {
        System.out.println("sectiginiz kisi turu " + kisiTuru +
                " lutfen asagıdaki islemlerden seçim yapınız");

        System.out.println(" ============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                ekle();
                islemMenüsüneDonus();
                break;
            case 2:
                arama();
                islemMenüsüneDonus();
                break;
            case 3:
                listeleme();
                islemMenüsüneDonus();
                break;
            case 4:
                silme();
                islemMenüsüneDonus();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("hatalı giriş..");
                islemMenüsü();
                break;
        }
    }

    public static void islemMenüsüneDonus() {
        System.out.println("lutfen secim yapınız.\n" +
                "1-Ana menü\n" +
                "2-İslem menüsü\n" +
                "3-uygulamayı sona erdir.");
        int sira = scan.nextInt();

        switch (sira) {
            case 1:
                girisPaneli();
                break;
            case 2:
                islemMenüsü();
                break;
            case 3:
                cikis();
                break;
            default:
                System.out.println("lutfen gecerli bir sayi giriniz");
                islemMenüsüneDonus();
                break;
        }
    }

    public static void ekle() {
        // bu method hem ogrenci hem de ogretmen eklemek icin tasarlandı.

        System.out.println("****  " + kisiTuru + " ekleme sayfasin hos geldin" + " ****");

        scan.nextLine();//dummy kod

        System.out.println("isim soyisim gir");
        String adSoyad = scan.nextLine().toUpperCase();

        System.out.println("kimlikNo gir");
        String kimlikNo = scan.next().toUpperCase();

        System.out.println("yas gir");
        scan.nextLine();//dummy kod
        int yas = scan.nextInt();

        if (kisiTuru.equals("OGRENCİ")) {

            scan.nextLine();//dummy kod
            System.out.println("Ogrenci no giriniz");
            String ogrenciNo = scan.nextLine().toUpperCase();

            System.out.println("sınıf giriniz");
            String sınıf = scan.nextLine().toUpperCase();

            ogrenci ogrenci = new ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sınıf);
            ogrenciList.add(ogrenci);

            System.out.println("ekleme işlemi başarılı.");

        } else {
            scan.nextLine();//dummy kod
            System.out.println("bolum gir");
            String bolum = scan.nextLine().toUpperCase();

            System.out.println("sicil no gir");
            String sicilNo = scan.nextLine().toUpperCase();

            ogretmen ogretmen = new ogretmen(adSoyad, kimlikNo, yas, bolum, sicilNo);
            ogretmenList.add(ogretmen);

            System.out.println("ekleme işlemi başarılı.");
        }


    }

    public static void arama() {

        boolean flag = true;

        if (kisiTuru.equals("OGRENCİ")) {

            System.out.println("lutfen aradıgınız öğrencinin kimlik nosunu bosluksuz sekilde giriniz");
            String kimlik;
            kimlik = scan.next().replaceAll(" ", "");


            for (kisi each : ogrenciList) {
                if (each.getKimlikNo().equals(kimlik)) {
                    System.out.println("Aradığınız ogrenci: " + each.getAdSoyad());
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Aradığınız ogrenci bulunmamaktadır");
            }


        } else {

            System.out.println("lutfen aradıgınız ogretmenin kimlik nosunu bosluksuz sekilde giriniz");
            String kimlik;
            kimlik = scan.next();


            for (kisi each : ogretmenList) {
                if (each.getKimlikNo().equals(kimlik)) {
                    System.out.println("Aradığınız ogretmen: " + each.getAdSoyad());
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Aradığınız ogretmen bulunmamaktadır");
            }
        }

    }

    public static void listeleme() {

        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println(ogrenciList);
        } else {
            System.out.println(ogretmenList);
        }
    }

    public static void silme() {
        boolean flag = true;

        if (kisiTuru.equals("OGRENCİ")) {
            System.out.println(ogrenciList);
            System.out.println("lutfen aradıgınız öğrencinin kimlik nosunu bosluksuz sekilde giriniz");
            String kimlik;
            kimlik = scan.next().replaceAll(" ", "");

            for (kisi each : ogrenciList) {
                if (each.getKimlikNo().equals(kimlik)) {
                    ogrenciList.remove(each);
                    System.out.println("ogrenci silinmistir. Silinen ogrenci: "+each.getAdSoyad());
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("böyle bir ogrenci bulunmamaktadır");
            }

        } else {
            System.out.println(ogretmenList);
            System.out.println("lutfen aradıgınız ogretmenin kimlik nosunu bosluksuz sekilde giriniz");
            String kimlik;
            kimlik = scan.next().replaceAll(" ", "");

            for (kisi each : ogretmenList) {
                if (each.getKimlikNo().equals(kimlik)) {
                    ogretmenList.remove(each);
                    System.out.println("ogretmen silinmistir. Silinen ogretmen: " + each.getAdSoyad());
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("boyle bir ogretmen bulunmamaktadır");
            }
        }
    }

    public static void cikis() {
        System.out.println("çıkış yapılmıştır.");
    }


}
