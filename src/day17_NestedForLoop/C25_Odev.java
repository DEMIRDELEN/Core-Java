package day17_NestedForLoop;

public class C25_Odev {
    /*
    1'den 100'e kadar olan doğal sayıların toplamını bulan programı yazınız.

    OutPut:

    Sayilarin Toplami : 5050
     */

    public static void main(String[] args) {
        int sayi=1;
        int toplam=0;

        while (sayi<=100){

            toplam+=sayi;

            sayi++;

        }
        System.out.println(toplam);
    }
}
