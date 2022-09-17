package day26_Constructor;

public class KamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();
        System.out.println("kamyon1 ozellikleri" + kamyon1.toString());
        System.out.println("");

        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("kamyon2 bilgileri " + kamyon2.toString());
        System.out.println("");

        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2007, 400000);
        System.out.println("kamyon3 bilgileri " + kamyon3.toString());
        System.out.println("");

        Kamyon kamyon4 = new Kamyon("scania", "s540");
        System.out.println("kamyon4 bilgileri " + kamyon4.toString());
        System.out.println("");

    }
}
