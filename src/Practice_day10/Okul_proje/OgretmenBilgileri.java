package Practice_day10.Okul_proje;

public class OgretmenBilgileri {

    String isim = "";
    String soyİsim = "";
    int yas = 0;
    String brans = "";
    String tel = "";

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyİsim, int yas, String brans,
                             String tel) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri" +
                "\nisim: " + isim +
                "\nsoyİsim: " + soyİsim +
                "\nyas: " + yas +
                "\nbrans: " + brans +
                "\ntel: " + tel;
    }
}
