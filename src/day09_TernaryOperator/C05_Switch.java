package day09_TernaryOperator;

import java.util.Scanner;

public class C05_Switch {
    public static void main(String[] args) {

        //kullanıcıdan gun numarasını al ve 1 se pazartesi 7 ise pazar yazdır
        //switch yanına yazılan parantez () neye göre case atayacağımızı gösterir.
        //java girilen case ı bulur o satırdan çalıştırmaya başlar ve devam eder
        // durması için ya break ya da switch parantezi arar.

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen sayıyı girin");

        int sayi = scan.nextInt();

        switch (sayi) {

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("geçerli gun numarası gir");
        }
    }
}
