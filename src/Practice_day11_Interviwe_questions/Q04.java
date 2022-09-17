package Practice_day11_Interviwe_questions;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String sifre = "erdal.bey123";
        int girisHakki = 3;

        while (true) {
            System.out.println("lutfen bir string giriniz");
            String str = scan.nextLine();
            if (sifre.equals(str)) {
                System.out.println("hosgeldiniz");
                break;
            } else {
                girisHakki--;
                System.out.println("sifre yanlıs" + " kalan deneme hakkı " + girisHakki);
                if (girisHakki == 0) {
                    System.out.println("giris bloke oldu.");
                    break;
                }
            }
        }
    }

}
