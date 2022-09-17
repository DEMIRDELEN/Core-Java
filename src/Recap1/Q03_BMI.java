package Recap1;

import java.util.Scanner;

public class Q03_BMI {
    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen kilonuzu girin");

        double kg= scan.nextDouble();

        System.out.println("lutfen boyunuzu (M) girin");

        double boy= scan.nextDouble();

        double kitleIndeksi = kg/(boy*boy);

        System.out.println("index = " + kitleIndeksi);

        scan.close();
    }
}
