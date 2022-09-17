package day28_StaticBlock;

public class C01_StaticBlock {

    static int sayi;

    static {
        /*
        static block class uyelerinin tamamindan once calisir(mainden de önce)

        static block class olusturuldugunda calisir, genelllikle de classla ilgili on ayarlamalar veya static
        variable lara deger atamak icin kullanılır

        static blockların class icinde nerede oldugu onemli degildir, once static blocklar calısır.
        birden fazla static block varsa yukarıdan asagı dogru calisir.
         */
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        System.out.println(sayi);
    }
    static {
        System.out.println("main method altındaki static block calisti");
    }
}
