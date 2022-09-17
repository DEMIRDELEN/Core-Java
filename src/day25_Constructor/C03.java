package day25_Constructor;

public class C03 {
    /*
    proje olsutururken bazı class lar run etmek icin degil variable ve method olusturup
    bunları baska classlardan kullanmak icin olusturulur
     */
    /*
    default constructor parametresizdir, göremesek bile ihtiyac oldugunda calisir

    class icinde parametreli veya parametresiz herhangi bir constructor olusturursak java
    default constructor ı siler
     */

    C03(){

    }
    /*
    olsturdugumuz parametresiz bu constructor default constructor ile bire bir aynıdır
    ama biz olusturdugumuz icin buna default constructor demeyiz, parametresiz constructor deriz

     */
    String isim="etka";

    public void method01(){

        System.out.println("C03 method calisti");
    }
}
