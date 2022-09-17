package day35_InheritancedaConstructorKullanımı;

public class Matematikciler extends LOgretmen {

    Matematikciler() {

        System.out.println("matematikciler parametresiz cons");
    }

    Matematikciler(String isim) {
        this();
        System.out.println("matematikciler parametreli cons");
    }

    public static void main(String[] args) {
        Matematikciler hoca1 = new Matematikciler("ali");

    }
    /*
    this cons call icinde bulunulan class daki consları, super cons call ise parent class da bulunan
    consları cagırır.

    this vey super parametre yapısınna uygun bir cons bulamazsa java CTE verir.

    cons konusunda this. o class daki instance variableları refere ediyordu.
    inheritanceda da super. vardır ve parent classdaki instance leri refere eder.
     */
}
