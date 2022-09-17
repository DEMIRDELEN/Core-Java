package lambda_functional_programming01;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Utils {
    public static void ayniSatirdaBosluklaYazdir(Object obj) {
        System.out.print(obj + " ");
    }

    public static boolean ciftElemaniSec(int x) {

        return x % 2 == 0;
    }

    public static boolean tekElemaniSec(int x) {

        return x % 2 == 1;
    }

    public static double IntegerDegerinYarisiniAl(int x) {

        return x / (2.0);
    }

    public static char sonKarakteriAl(String str) {
        return str.charAt(str.length() - 1);
    }

    public static char ılkKarakteriAl(String str) {
        return str.charAt(0);
    }

    public static int SayilarinRakamlariToplami(int x) {
        int toplam = 0;
        while (x > 0) {

            toplam += x % 10;
            x /= 10;
        }
        return toplam;
    }
}
