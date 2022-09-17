package day21_Arrays;

public class C12_Odev {
    public static void main(String[] args) {
        /*
        2- Array deki sayıları tolpayan Java kodunu yazınız.
array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Beklenen Çıktı:
Array toplamı: 55
         */

        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam=0;

        for (int i = 0; i < array.length ; i++) {

            toplam+=array[i];

        }

        System.out.println(toplam);
    }
}
