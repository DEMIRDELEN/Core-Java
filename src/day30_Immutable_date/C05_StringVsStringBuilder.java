package day30_Immutable_date;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yoksa stringuilder mi daha hızlıdır

        bunun icin bir string olusturup 1000 kere sonuna . ekleyelim
        oncesinde ve sonrasında zamanı alıp aradaki farkı bulalım

        aynı islem string builder ile de yapalım
         */
        LocalTime baslangıc= LocalTime.now();
        String str="Ahhh java";
        for (int i = 0; i <10000 ; i++) {
            str+=".";
        }
        LocalTime bitis= LocalTime.now();

        System.out.println(baslangıc);
        System.out.println(bitis);

        System.out.println("bitis.getNano()-baslangıc.getNano() = " + (bitis.getNano() - baslangıc.getNano()));

        System.out.println("");

        baslangıc= LocalTime.now();
        StringBuilder sb =new StringBuilder("Ahhhh java");
        for (int i = 0; i <10000 ; i++) {
            sb.append(".");
        }
        bitis= LocalTime.now();

        System.out.println(baslangıc);
        System.out.println(bitis);

        System.out.println("bitis.getNano()-baslangıc.getNano() = " + (bitis.getNano() - baslangıc.getNano()));

    }
}
