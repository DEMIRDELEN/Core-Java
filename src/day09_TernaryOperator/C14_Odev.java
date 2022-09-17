package day09_TernaryOperator;

import java.util.Scanner;

public class C14_Odev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen haftanın kaçıncı gunu ise yazınız ");

        int kısa =scan.nextInt();

        switch (kısa){
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
                System.out.println("geçerli bir sayı giriniz");
        }

    }
}
