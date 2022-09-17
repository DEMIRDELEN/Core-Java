package dev_projectRequirements;

public class Manav_Runner1 {

    public static void main(String[] args) {

        Manav obj = new Manav();

        obj.urunleriEkle(obj.urunler, obj.fiyat);

        boolean bittiMi = true;
        int secim;


        while (bittiMi) {
            obj.ıslemMenusuYazdir();

            secim = obj.scan.nextInt();

            switch (secim) {
                case 1:
                    obj.urunleriListele(obj.urunler, obj.fiyat);
                    obj.sepeteEkle();
                    break;
                case 2:
                    obj.sepet();
                    obj.ödeme();

                    bittiMi = false;
                    break;
                case 3:
                    obj.ıslemIptal();

                    bittiMi = false;
                    break;
                default:
                    System.out.println("gecerli bir numara giriniz");
            }
        }
    }
}

