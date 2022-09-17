package day21_Arrays;

import java.util.Arrays;

public class C06_ArreyeElemanEkleme {
    public static void main(String[] args) {

        String takimlistesi[] = {"suleyman", "osman"};
        String eklenecekIsim = "talha";

        takimlistesi = C05_ArrayeElementEkleme.elemanEkle(takimlistesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimlistesi));

    }
}
