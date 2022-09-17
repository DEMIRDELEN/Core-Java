package day12_StringManipulation;

import java.util.Scanner;

public class C12_Odev {
    public static void main(String[] args) {

        /*Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java
        programı yazın. Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

Ornek:

INPUT :

25

46

OUTPUT :

Numaralarin Toplami:

71*/
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen sayı girin");

        int sayi= scan.nextInt();

        System.out.println("ikinci ssayi");

        int sayi1= scan.nextInt();

        if (sayi>=0 && sayi1>=0) {
            if (sayi>=1000000000 || sayi1>=1000000000 || sayi1+sayi>=1000000000) {
                System.out.println("Owerflow");
            }else {
                System.out.println(sayi+sayi1);
            }
        } else {
            System.out.println("siktir git pozitif sayı gir aq");
        }
    }
}
