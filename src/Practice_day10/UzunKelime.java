package Practice_day10;

import java.util.Scanner;

public class UzunKelime {
    public static void main(String[] args) {

        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cumle girin");
        String cumle = scan.nextLine();

        enUzunKelime(cumle);
    }

    public static String enUzunKelime(String cumle) {

        String kelimeler[] = cumle.split(" ");

        int max=kelimeler[0].length();
        String longestWord="";

        for (int i = 1; i < kelimeler.length ; i++) {
            if (max>kelimeler[i].length()){
                max=kelimeler[i].length();
                longestWord=kelimeler[i];
            }
        }
        return longestWord;
    }
}
