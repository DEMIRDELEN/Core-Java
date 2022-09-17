package day03_scanner;

public class C02_Swap {

    public static void main(String[] args) {

        int sayı1 = 10, sayı2 = 20, sayı3 = 0;

        //sayı 3 e 20 değeri nasıl verilir.

        sayı3 = sayı2;

        // birinci sayıyı ikinciye atama

        sayı2 = sayı1;

        // boş kovadaki sayıyı sayı 1 e atama

        sayı1 = sayı3;

        System.out.println(sayı1);
        System.out.println(sayı2);
        System.out.println("swaptan sonra sayı1 : " + sayı2);


    }
}
