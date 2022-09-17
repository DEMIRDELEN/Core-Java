package day23_ArrayLists;

import java.util.Scanner;

public class C22_Odev {
    public static void main(String[] args) {
        /*
        11- Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.
Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100

         */
        Scanner scan= new Scanner(System.in);

        System.out.println("ilk sayi");

        int sayi1= scan.nextInt();

        System.out.println("ikinci sayi");

        int sayi2= scan.nextInt();

        int toplam=sayi1+sayi2;

        System.out.println();
    }
}
