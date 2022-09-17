package day08_İfStatementsIf;

import java.util.Scanner;

public class C02_NestedİfElse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen cinsiyetinizin ilk harfini girin(erkek-kadın)");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("lutfen yaşınızı yazınız");

        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {

            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");

            } else if (yas < 65) {
                System.out.println("emekli olamazsın");

            } else {
                System.out.println("emekli olabilirsin");
            }

        }    else if (cinsiyet == 'K') {

            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            }else if (yas < 60) {
                System.out.println("emekli olamazsın");

            } else {
                System.out.println("emekli olabilirsin");
            }

        } else {
            System.out.println("geçerli bir cinsiyet girin");

        }
    }
}
