package day33_Encapsulation;

public class Araba_Runner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();

        arb1.marka = "toyota";

        System.out.println(arb1.marka);

        // markayı degistirelim ama göremeyelim
        // yakıtı da görelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanımlamak isterseniz,
        // 1. adım- ozel yetki tanımlayacağınız variable ları private yapın.
        // private bir dataya baska classlardan ulasmak mumkun olmadıgından
        // 2. adım- set yetkisi ici setter ve get yetkisi icin getter methodları olusturalım

        arb1.setModel("supra");
        System.out.println(arb1.getYakıt());
    }
}
