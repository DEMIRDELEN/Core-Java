package day14_MethodCreation;

public class C02_Odev {
    public static void main(String[] args) {

        // ekrana 10 kez java güzeldir yazdır

        String x ="java guzeldir";

        tekrarYazdir(x);

    }

    public static void tekrarYazdir(String x) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(x);
        }
    }

}
