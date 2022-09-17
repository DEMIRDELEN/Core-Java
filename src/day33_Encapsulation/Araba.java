package day33_Encapsulation;

public class Araba {

    String marka = "marka belirtilmedi";
    private String model = "model belirtilmedi";
    private String yakıt = "elektrikli"; // tum arabalar elektrikli ise bu
                                        // variable degistirilmemeli.

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakıt() {
        return yakıt;
    }
}
