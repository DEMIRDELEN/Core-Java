package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {

        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String sınıfList[] = {"ali can", "nida yucedal", "musa yaman"};

        String eklenecekİsim = "murat babayigit";

        sınıfList = elemanEkle(sınıfList, eklenecekİsim);

        System.out.println(Arrays.toString(sınıfList));
        
    }

    public static String[] elemanEkle(String[] sınıfList, String eklenecekİsim) {

        String yeniSinifListesi[] = new String[sınıfList.length + 1];

        for (int i = 0; i < sınıfList.length; i++) {

            yeniSinifListesi[i] = sınıfList[i];

        }

        yeniSinifListesi[yeniSinifListesi.length - 1] = eklenecekİsim;

        return yeniSinifListesi;

    }
}
