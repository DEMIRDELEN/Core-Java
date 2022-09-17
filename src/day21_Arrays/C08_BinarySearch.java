package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        binarysearch javada eleman aramanın kısa yoludur
        ancak binarysearch un çalışması icin once array in sıralı hale getirilmesi gerekir
        eger sıralı yapmadan binarysearch yaparsanız sonucu bulamayabilir ya da yanlış bulabilir
         */

        String harfler[] = {"Y", "B", "D", "G", "O", "A"};

        String arananHarf = "Y";

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler));

        int x = Arrays.binarySearch(harfler, arananHarf);

        System.out.println(x);

        //binarysearch bize aradığımız elemanın indeksini döndürür
        //Array sıralı olmadığı için arama sonucunu dogru bulamayabilir emin olmak için önce sort yapmalıyız


    }
}
