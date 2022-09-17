package day26_Constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogretmen1= new Ogretmen();
        System.out.println("ogretmen1: "+ ogretmen1);
        System.out.println("");

        Ogretmen ogretmen2= new Ogretmen("emre","akdogan",
                "1/1/2001","matematik","fizik");
        System.out.println("ogretmen2: "+ ogretmen2.toString());
        System.out.println("");

        Ogretmen ogretmen3= new Ogretmen("cavidan","kabinkara", "1/1/2001");
        System.out.println("ogretmen3: "+ ogretmen3.toString());
    }
}
