package Practice_day06;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int sayi= scan.nextInt();

        basamakToplamı(sayi);

    }

    public static void basamakToplamı(int sayi) {

        int toplam=0;

        while (sayi>0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);
    }
}
