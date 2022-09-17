package day09_TernaryOperator;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen sayıyı girin");

        double sayi = scan.nextDouble();

        if (sayi>0) {
            System.out.println(sayi);
        } else {
            System.out.println("lütfen bir sayı daha girin");
            double sayi1= scan.nextDouble();
            System.out.println(sayi*sayi1);

            //ternary de içerde kod yazılmaz, örneğin else if kısmı
        }
    }
}
