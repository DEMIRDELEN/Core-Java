package day34_Inheritance;

public class ToyotaCorolla extends Toyota {
    public static void main(String[] args) {
        /*
        child class dan parent class a erişimde access modifier kurallarını by pass edemeyiz
        ornegin parent class daki private class uyelerini child class dan kullanamayız.
         */
        ToyotaCorolla araba1 = new ToyotaCorolla();
        System.out.println(araba1.marka);
        System.out.println(araba1.model);
    }


}
