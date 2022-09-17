package day29_PassByValue_Immutable;

public class C04_ImmutableClass {
    public static void main(String[] args) {
        /*
        ımmutable: degistirilemez
        mutable  : degistirilebilir

        en meshur ımmutable class : String
         */

        String str = "Yildiz bank";

        System.out.println(str.toUpperCase());

        str.toLowerCase();

        System.out.println(str);

        str.substring(3, 5);

        System.out.println(str);

        //javada string gibi metin ifadelerde kullanabilecegimiz mutable StringBuilder class ı da vardır

        StringBuilder sb = new StringBuilder("java Bank");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        sb.append(".");

        System.out.println(sb);


    }
}
