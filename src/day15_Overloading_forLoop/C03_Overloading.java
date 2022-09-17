package day15_Overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7);
        topla(5.2,3);
    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("iki integerin toplamı: "+ (sayi1+sayi2));
    }
/* parametre sayısı ve parametre türleri aynı olan 2 method oluşturamayız.

    public static void topla(int sayi1, int sayi2) {
        System.out.println("iki integerin toplamı: " + (sayi1 + sayi2));

    }   */

    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir double ve bir integerin toplamı: " + (sayi1 + sayi2));
    }

    public static void topla(double sayi1, double sayi2) {
        System.out.println("iki double'ın toplamı: " + (sayi1 + sayi2));
    }
}

