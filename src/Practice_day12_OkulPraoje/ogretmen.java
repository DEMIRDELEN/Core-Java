package Practice_day12_OkulPraoje;

public class ogretmen extends kisi{

    private String bolum;
    private String sicilNo;

    private static int count=0;

    public ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public ogretmen(){

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        count++;
        return "\n"+count+". OGRETMEN\n" +
                "bolum: " + bolum + "\n" +
                "sicilNo: " + sicilNo + "\n" +
                super.toString() + "\n\n";
    }
}
