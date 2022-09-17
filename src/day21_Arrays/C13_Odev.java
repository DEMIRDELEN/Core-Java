package day21_Arrays;

public class C13_Odev {
    public static void main(String[] args) {

        /*
        3- Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.
Array = [20, 30, 25, 35, -16, 60, -100 ]
Beklenen Çıktı:
Array Sayılarının ortalaması: 7.0
         */

        int Array[] = {20, 30, 25, 35, -16, 60, -100};

        int toplam=0;

        for (int i = 0; i < Array.length ; i++) {

            toplam+=Array[i];

        }

        int ortalama=toplam/ Array.length;

        System.out.println(ortalama);
    }
}
