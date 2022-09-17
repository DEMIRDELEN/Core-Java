package Practice_day11_Interviwe_questions;


import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir asal sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi>1) {
            for (int i = 2; i <sayi ; i++) {
                if (sayi%i==0){
                    System.out.println("sayimiz asal değildir");
                    break;
                } else {
                    System.out.println("sayimiz asal sayidir.");
                    break;
                }
            }
        } else {
            System.out.println("lutfen 1 den buyuk pozitif tam sayi giriniz");
        }
    }
}
