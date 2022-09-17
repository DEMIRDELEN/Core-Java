package day21_Arrays;

public class C02_EnUzunVeKısaKelime {
    public static void main(String[] args) {
        // Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String isimler[] = {"onur", "erdal", "Mehmet", "Hayrullah", "mihrican"};

        enUzunVeKisayiYazdir(isimler);

    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];

        String enKisaKelime = isimler[0];

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunKelime.length()) {

                enUzunKelime = isimler[i];

            }

            if (isimler[i].length() < enKisaKelime.length()) {

                enKisaKelime = isimler[i];

            }

        }

        System.out.println("enUzunKelime = " + enUzunKelime);
        System.out.println("enKisaKelime = " + enKisaKelime);

    }
}
