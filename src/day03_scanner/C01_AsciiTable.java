package day03_scanner;

public class C01_AsciiTable {

    public static void main(String[] args) {

        int sayı=10;
        char harf='a';
        String str="banan";

        System.out.println(sayı+harf);
        System.out.println(sayı*harf);
        System.out.println(str+harf);
        System.out.println(str+sayı+harf);
        System.out.println(""+sayı+harf);

        /*
        char'ı ile matematiksel işlem yaparsan sayı gibi davranır, yazı ile toplarsan yazı gibi davranır

        String ile diğer dataları toplarsan string baskın çıkar.
        */

    }
}
