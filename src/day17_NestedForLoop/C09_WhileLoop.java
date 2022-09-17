package day17_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sifre="";

        boolean sifreBasariliMi=false;

        while (!sifreBasariliMi){

            System.out.println("lütfen şifre girin");
            sifre=scan.nextLine();

            char ilk= sifre.charAt(0);
            char son= sifre.charAt(sifre.length()-1);

            boolean şart = (ilk>='A' && ilk<='Z') && (son >= 'a' && son <= 'z') &&
                    !sifre.contains(" ") && sifre.length() >= 8;

            if (şart){
                System.out.println("şifre kaydedildi");
                sifreBasariliMi=true;
            }else {
                System.out.println("başarısız şifre");
            }
        }
    }
}
