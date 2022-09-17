package Practice_day01;

import java.util.Scanner;

public class Q14_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen fiyat girin");

        double fiyat= scan.nextDouble();

        System.out.println(fiyat<10 ? "ucuz" :
                         fiyat<20 ? "normal" : "pahalı");
    }
}
