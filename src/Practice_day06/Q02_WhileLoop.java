package Practice_day06;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        int bas = 0;

        while (sayi > bas) {
            if (bas % 2 == 1) {
                System.out.println(bas + " ");
            }
            bas++;
        }
    }
}
