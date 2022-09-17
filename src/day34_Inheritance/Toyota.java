package day34_Inheritance;

public class Toyota {

    protected String marka = "toyota";
    protected String model = "model belirtilmedi";
    protected String yakıt = "yakıt belirtilmedi";


    protected void motor() {
        System.out.println("toyota cevreci motorlar kullanır.");
    }

    protected void aku() {
        System.out.println("toyota, modele aku kullanır.");
    }
}
