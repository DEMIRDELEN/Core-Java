package day29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_PassByValue {
    public static void main(String[] args) {
        /*
        birden fazla element iceren array ve arraylist gibi yapılarda da passbyvalue gecerlidir.
        eger method da array veya listin kendisi degistirilirse passbyvalue özelligi sebebiyle java degisen degeri degil array veya list in orijinal degerini alır
        ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse java obje degismedigi icin (referans aynı) aynı array veya listi bize dondurur
        ancak icindeki elementler degismis olacaktır.

        verilen 4 elemanlı bir array i method a gönderelim, methodda yeni 3 elemanlı bir array atayip bu yeni array e
        rastgele 100 den kucuk 3 sayi atayalım method da array i yazdıralım. main method da da method call dan sonra yeniden methodu yazdıralım
         */
        int arr[] = {3, 5, 8, 10};

        arrayiDegistir(arr);

        System.out.println("methoddan sonra: " + Arrays.toString(arr));

    }

    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];
        Random rnd = new Random();

        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("methodda array: " + Arrays.toString(arr));
    }
}
