package Practice_day04;

import java.util.Scanner;

public class Q02_MethodCreation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen metre ve kilometreye donusturmek istediginiz cm yi giriniz");

        double deger = scan.nextDouble();

        uzunluguCevir(deger);
    }

    public static void uzunluguCevir(double deger) {

        double meter = deger / 100;
        double kMeter = deger / 100000;

        System.out.println("girdiginiz cm degeri şu kadar metre : "
                +meter+" ve şu kadar kilometredir"+kMeter);
    }
}
