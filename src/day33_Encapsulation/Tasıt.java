package day33_Encapsulation;

public class Tasıt {

    private String tasitturu;
    private boolean muayenesiVarMi;
    private int yil;

    public String getTasitturu() {
        return tasitturu;
    }

    public void setTasitturu(String tasitturu) {
        this.tasitturu = tasitturu;
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
        //boolean variable lar icin olusturulan getter method ismi "isVariable" şeklinde olur
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
