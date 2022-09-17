package day26_Constructor;

public class Ogretmen {
    String isim = "İsim belirtilmedi";
    String soyİsim = "Soyisim belirtilmedi";
    String dogumTarihi = "tarih girilmedi";
    String brans = "brans girilmedi";
    String yanBrans = "brans girilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyİsim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyİsim, String dogumTarihi) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim: " + isim +
                "\nsoyİsim: " + soyİsim +
                "\ndogumTarihi: " + dogumTarihi +
                "\nbrans: " + brans +
                "\nyanBrans: " + yanBrans ;
    }
}
