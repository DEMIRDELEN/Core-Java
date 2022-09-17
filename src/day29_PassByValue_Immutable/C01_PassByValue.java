package day29_PassByValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
        4 elemanlı bir array olsturalım sonra ayrı bir methodda bu array in 2. ve 4. elemanlarını 100 den kucuk rastgele
        bir sayi ile degistirelim ve yeni halini yazdiralim
         */

        int arr[] = {5, 7, 8, 10};

        elemanDegistir(arr);
    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();

        arr[1] = rnd.nextInt(100);

        arr[3] = rnd.nextInt(100);

        System.out.println(Arrays.toString(arr));
    }
}
