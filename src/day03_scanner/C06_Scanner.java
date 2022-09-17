package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi girin");

        String isim = scan.nextLine();

        // bir kelime için next(), birden fazla ise nextLine()

        System.out.println("lütfen soy isminizi girin");

        String soyİsim = scan.nextLine();

        System.out.println("lütfen yaşınızı girin");

        int yaş = scan.nextInt();

        System.out.println("Girilen bilgiler: " +isim+" "+soyİsim+" "+yaş);


    }
}
