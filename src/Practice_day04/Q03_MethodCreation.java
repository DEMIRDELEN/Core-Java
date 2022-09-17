package Practice_day04;

import java.util.Scanner;

public class Q03_MethodCreation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen 47 den kucuk bir tam sayi degeri girin");

        int sayi = scan.nextInt();

        fibonacci(sayi);


    }

    public static void fibonacci(int sayi) {

        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3;
        System.out.println(sayi1 + " ");
        System.out.println(sayi2 + " ");

        if (sayi < 47) {
            for (int i = 2; i < sayi; i++) {

                sayi3 = sayi1 + sayi2;
                System.out.println(sayi3 + " ");
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        } else {
            System.out.println("47 den kucuk sayi gir");
        }

    }
}