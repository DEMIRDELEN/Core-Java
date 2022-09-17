package day04_DataCasting;

public class C09_Ödev {
    public static void main(String[] args) {

        double sayı1= 255.36;

        int sayı2= (int) sayı1;

        byte sayı3= (byte) sayı2;

        int sayı4= sayı3;

        System.out.println(sayı3);

        System.out.println(sayı4);
    }
}
