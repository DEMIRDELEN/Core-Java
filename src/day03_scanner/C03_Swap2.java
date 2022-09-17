package day03_scanner;

public class C03_Swap2 {

    public static void main(String[] args) {


        // kovasız değişim
        int a = 10;
        int b = 20;
        System.out.println("a :" + a + " b :" + b);

        a = a + b; // a = 30  b = 20
        b = a - b; // b = 10  a = 30
        a = a - b; // a = 20  b = 10

        System.out.println("Degiskenler degistirildi...\n"+ "a :" + a + " b :" + b);
    }
}
