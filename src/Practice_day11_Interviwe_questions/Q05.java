package Practice_day11_Interviwe_questions;


public class Q05 {
    public static void main(String[] args) {

        //normal toplama methodu ile ve varargs ile toplama methodu yazınız.

        int arr[] = {17, 23, 33, 9, 20};

        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        varargsToplaList(25, 55, 63, 21, 20);
        System.out.println("varargsToplaArr(arr) = " + varargsToplaArr(arr));
        toplamke(arr);

        // varargs array gibi davrandıgı icin herhangi bir array i parametre olarak verebiliriz.
    }

    private static void toplamke(int... is) {
        int toplam=0;
        for (int each : is
        ) {
            toplam += each;
        }
        System.out.println("toplam = " + toplam);
    }

    public static int varargsToplaArr(int... arr) {
        int toplam=0;

        for (int each : arr
        ) {
            toplam += each;
        }
        return toplam;
    }

    public static void varargsToplaList(int i, int i1, int i2, int i3, int i4) {
    }

    public static int arrTopla(int[] arr) {
        int toplam = 0;
        for (int each : arr
        ) {
            toplam += each;
        }
        return toplam;
    }
}
