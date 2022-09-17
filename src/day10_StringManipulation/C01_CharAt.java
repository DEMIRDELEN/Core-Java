package day10_StringManipulation;

public class C01_CharAt {
    public static void main(String[] args) {

        String str="java öğrenmek ne güzel";

        System.out.println(str.charAt(0));
        System.out.println(str.toUpperCase().charAt(7));
        System.out.println(str.charAt(21));
        // System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException
        // son harfi bulmak için uzunluğun bir eksiğini girmek gerekir.

        //charAt metodu kullanıldığında sonuç char olacağı çin sonuç char olacağı için manipulasyon kullanılamaz.
        //Stringden kullanman gerekn bir metod varsa charAt den önce kullanılmalı



    }
}
