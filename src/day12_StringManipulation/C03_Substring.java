package day12_StringManipulation;

public class C03_Substring {
    public static void main(String[] args) {

        String isim= "suleyman";
        String soyisim= "karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3));
        System.out.println(isim.substring(2,4));
        System.out.println(soyisim.substring(soyisim.length()-3));

        String ilkharf= isim.substring(0,1).toUpperCase();
        String gerikalan= isim.substring(1).replaceAll("\\w","*");

        String soyilk= isim.substring(0,1).toUpperCase();
        String soygerikalan= isim.substring(1).replaceAll("\\w","*");

        String kart4= kartNo.substring(0,4);
        String kredigerikalan= " **** **** ****";

        System.out.println(ilkharf+gerikalan+ " " +soyilk+soygerikalan+"\n"+ kart4+kredigerikalan);


    }
}
