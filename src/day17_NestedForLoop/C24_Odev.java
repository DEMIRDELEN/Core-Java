package day17_NestedForLoop;

import java.util.Scanner;

public class C24_Odev {
    /*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

    Input :1238

    Output :Girilen Numananin Tersi: 8321
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir tam sayı giriniz");
        int sayi= scan.nextInt();
        String sayi1= String.valueOf(sayi);

        for (int i = sayi1.length()-1; i >=0 ; i--) {

            System.out.print(sayi1.substring(i,i+1));

        }
    }
}

