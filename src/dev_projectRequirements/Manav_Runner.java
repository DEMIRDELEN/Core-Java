package dev_projectRequirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav_Runner {


    static List<String> urunler = new ArrayList<>();
    static List<Double> fiyat = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static List<String> sepettekiUrunler = new ArrayList<>();
    static List<Double> sepettekiFiyat = new ArrayList<>();
    static List<Double> sepettekikg = new ArrayList<>();
    static double toplamFiyat = 0;
    static double toplamKg = 0;
    static double ucretsizKargoHizmeti = 200 - toplamFiyat;


    public static void main(String[] args) {

        urunleriEkle(urunler, fiyat);
        boolean bittiMi = true;
        int secim;


        while (bittiMi) {
            System.out.println();
            System.out.println("yapmak istedigini islemi giriniz");
            System.out.println(
                    "1- sepete urun ekle\n" +
                            "2- odeme\n" +
                            "3- islem iptal");

            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    urunleriListele(urunler, fiyat);
                    sepeteEkle();
                    break;
                case 2:
                    sepet();
                    ödeme();

                    bittiMi = false;
                    break;
                case 3:
                    ıslemIptal();

                    bittiMi = false;
                    break;
                default:
                    System.out.println("gecerli bir numara giriniz");
            }
        }


    }

    public static void ıslemIptal() {
        System.err.println("isleminiz iptal edilmistir. Bizi tercih ettiğiniz icin tesekkür ederiz.");
    }

    public static void ödeme() {
        int secim;
        System.err.println("lutfen odeme yontemini seçiniz\n" +
                "1-Nakit\n" +
                "2-Kedi Kartı\n" +
                "3-Banka Kartı\n" +
                "4-Kripto Para");

        boolean dongu = true;
        while (dongu) {

            secim = scan.nextInt();
            int kartNo;
            int sonKulAy;
            int sonKulYil;
            int cvcNo;

            switch (secim) {
                case 1:
                    System.out.println("odeme yönteminiz: Nakit olarak belirlenmiştir.");
                    System.out.println("Gelen kargo taşıyıcısına ödemenizi yapabilirsiniz. Bizi tercih ettiğiniz için teşekkür ederiz.");

                    dongu = false;
                    break;
                case 2:
                    System.out.println("odeme yönteminiz: Kredi Kartı olarak belirlenmiştir.");
                    System.out.println("lutfen kart numarasını giriniz.");
                    kartNo = scan.nextInt();
                    System.out.println("lutfen kartın son kullanma tarihini 2 basamaklı olarak ve ay ve yıl giriniz. Her giriş sonrasında enter'a basınız.");
                    sonKulAy = scan.nextInt();
                    sonKulYil = scan.nextInt();
                    System.out.println("lutfen kartınızın arkasında bulunan CVC nosunu giriniz");
                    cvcNo = scan.nextInt();
                    System.out.println("Bankanıza yönlendiriliyorsunuz. Bizi tercih ettiğiniz için teşekkür ederiz.");

                    dongu = false;
                    break;
                case 3:
                    System.out.println("odeme yönteminiz: Banka Kartı olarak belirlenmiştir.");
                    System.out.println("lutfen kart numarasını giriniz.");
                    kartNo = scan.nextInt();
                    System.out.println("lutfen kartın son kullanma tarihini 2 basamaklı olarak ve ay ve yıl giriniz. Her giriş sonrasında enter'a basınız.");
                    sonKulAy = scan.nextInt();
                    sonKulYil = scan.nextInt();
                    System.out.println("lutfen kartınızın arkasında bulunan CVC nosunu giriniz");
                    cvcNo = scan.nextInt();
                    System.out.println("Bankanıza yönlendiriliyorsunuz. Bizi tercih ettiğiniz için teşekkür ederiz.");

                    dongu = false;
                    break;
                case 4:
                    System.out.println("odeme yönteminiz: Kripto Para olarak belirlenmiştir.");
                    System.out.println("Soğuk cüzdanınıza yönlendiriliyorsunuz. Bizi tercih ettiğiniz için teşekkür ederiz.");

                    dongu = false;
                    break;
                default:
                    System.out.println("lutfen gecerli bir odeme turu giriniz");
            }
        }
    }

    public static void sepet() {
        System.out.println("sepettekiUrunler = " + sepettekiUrunler);
        System.out.println("sepettekikg = " + sepettekikg);
        System.out.println("toplamKg = " + toplamKg);

        if (ucretsizKargoHizmeti <= 0) {
            System.out.println("kargonuz ucretsizdir");
            System.out.println("toplamFiyat = " + toplamFiyat);
        } else {
            System.out.println("Kargo ücreti 20 tl");
            System.out.println("toplamFiyat = " + (toplamFiyat + 20));
        }
    }

    public static void sepeteEkle() {
        System.err.println("sepete eklemek istediginiz urunun kodunu giriniz lutfen");
        int urunKodu = scan.nextInt();
        System.err.println("lutfen kaç kg alacagınızı giriniz");
        double kg = scan.nextDouble();

        sepettekiUrunler.add(urunler.get(urunKodu));
        sepettekiFiyat.add(fiyat.get(urunKodu));
        sepettekikg.add(kg);
        toplamKg += kg;
        toplamFiyat += fiyat.get(urunKodu) * kg;
        System.err.println("Mevcut Fiyat (TL): " + toplamFiyat + "\nMevcut agırlık (Kg): " + toplamKg);

    }

    public static void urunleriEkle(List<String> urunler, List<Double> fiyat) {
        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Sogan");
        urunler.add("HavuC");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Cilek");
        urunler.add("Kavun");
        urunler.add("Üzüm");
        urunler.add("Limon");

        fiyat.add(20.10);
        fiyat.add(30.20);
        fiyat.add(30.50);
        fiyat.add(20.30);
        fiyat.add(30.10);
        fiyat.add(50.20);
        fiyat.add(100.90);
        fiyat.add(60.10);
        fiyat.add(40.30);
        fiyat.add(20.70);
        fiyat.add(10.50);
    }

    public static void urunleriListele(List<String> urunler, List<Double> fiyat) {

        System.out.println("\tNO\t\t\tURUN\t\t\tFIYAT" +
                "\n\t====\t\t========\t\t=======");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println("\t" + i + "\t\t\t" + urunler.get(i) + "\t\t\t" + fiyat.get(i));
        }
        System.out.println("200 tl ve üzeri alısverislerde kargo ücretsizdir");

    }
}
