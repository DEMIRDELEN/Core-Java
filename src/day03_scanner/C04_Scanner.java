package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //kullanıcının ismini isteyin ve girilen ismi
        // isminiz:..... şeklinde yazdırın
        // classa değer almak için scanner'ı kullanırız

        /*
        1) scanner objesi oluştur.
         */
        Scanner scan =new Scanner(System.in);

        //2) kullanıcıya ne istediğimizi söyleyelim

        System.out.println("lütfen ismini gir");

        //3) scan ile kullanıcının değerini alıp variableye atayalım

        String kullanıcıİsmi=scan.next();

        System.out.println("İsminiz : "+ kullanıcıİsmi);
    }
}
