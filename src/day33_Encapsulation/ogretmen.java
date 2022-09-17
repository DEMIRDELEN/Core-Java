package day33_Encapsulation;

public class ogretmen {

    private String isim;
    private String soyisim;
    private String brans;

    /*
    bazen de yetkileri sınırlamak degil de yapılan isi daha iyi tanımlamak icin encapsulation kullanılır

    bu yakalaşımı kullan calasslarda tüm variable lar pritve yapılıp hepsi icin getter ve setter olusturulur
     */

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
