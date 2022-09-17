package day31_TimeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {

        // verilen kaç integer olursa olsun hepsini toplayıp sonucu yazdıran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplayazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplayazdir(sayi1, sayi2, sayi3, sayi4);
        toplayazdir(sayi1, sayi2, sayi3);
        toplayazdir(sayi1, sayi2);
    }

    public static void toplayazdir(int... sayi) {

        /*
        int... bu gösterim integer variable lardan olusan bir varargs demektir.

        varargs array altyapısını kullanır.


         */

        int toplam = 0;
        int sayiAdedi= sayi.length;
        for (int each : sayi
        ) {
            toplam+=each;
        }
        System.out.println("toplam = " + toplam + "\nsayi adedi: "+ sayiAdedi);

    }
}
