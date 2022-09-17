package day12_StringManipulation;

import java.util.Scanner;

public class C10_Odev {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen ilk harfi büyük son harfi küçük en az 8 haneli bışluksuz şifre girin");

        String sifre= scan.nextLine();

        char ilk=sifre.charAt(0);
        char son=sifre.charAt(sifre.length()-1);

        boolean şart = (ilk>='A' && ilk<='Z') && (son >= 'a' && son <= 'z') && !sifre.contains(" ") && sifre.length() >= 8;
        if (şart==true) {
            System.out.println("sifre baasari ile tanimlandi");
        } else {
            System.out.println("islem basarisiz, lutfen yeni bir sifre girin");
        }
    }
}
