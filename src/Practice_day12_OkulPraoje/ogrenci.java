package Practice_day12_OkulPraoje;

public class ogrenci extends kisi{// cons control edilecek
    private String ogrenciNo;
    private String sınıf;

    private static int count=0;

    public ogrenci(String adSoyad, String kimlikNo, int yas, String ogrenciNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sınıf = sınıf;
    }

    public ogrenci(){

    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }

    @Override
    public String toString() {
        count++;
        return "\n"+count+". OGRENCİ\n" +
                "ogrenciNo: " + ogrenciNo + "\n" +
                "sınıf: " + sınıf + "\n" + super.toString() + "\n\n";

    }
}
