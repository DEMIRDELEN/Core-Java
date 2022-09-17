package day10_StringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";

        System.out.println(str.length()); // uzunluk
        System.out.println(str.charAt(str.length()-1));// sondan ilk karakter
        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakter
         //javada null pointer bir değer değil, karşısına yazıldığı variablenin hiç ibr değer almadığının işaretidir.

        String str1= ""; //değer atanmış ama değer hiçlik.
        System.out.println(str1.length());
        String str2= null; // değer atanmamıştır.Null bu değer atamamayı işaret etmektedir. (NullPointerException)
        System.out.println(str2.length());
    }
}
