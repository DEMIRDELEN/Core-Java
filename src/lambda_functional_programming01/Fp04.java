package lambda_functional_programming01;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println("yediden Yuze Sayilar Toplami: " + yedidenYuzeSayilarToplami());
        System.out.println();
        System.out.println("yediden Yuze Sayilar Toplami 2: " + yedidenYuzeSayilarToplami2());
        System.out.println();
        System.out.println("ikiden Onbire Carpim : " + ikidenOnbireCarpim());
        System.out.println(faktoriyelHesaplama(0));
        System.out.println();
        System.out.println(verilenIkiSayiArasindakiCiftSayilarinToplami(1, 5));

        System.out.println(verilenSayilarArasindakiSayilarinToplami(4,11));
    }

    //1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir method oluşturun.

    public static Integer yedidenYuzeSayilarToplami() {
        Integer toplam = IntStream.range(7, 100).reduce(Math::addExact).getAsInt();
        return toplam;


    }

    //2.yol
    public static Integer yedidenYuzeSayilarToplami2() {
        Integer toplam = IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
        return toplam;
    }
    //2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static Integer ikidenOnbireCarpim() {
        Integer carpim = IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
        return carpim;
    }
    //3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)

    public static Integer faktoriyelHesaplama(int x) {
        Integer Faktoriyel = null;
        try {
            Faktoriyel = IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        } catch (Exception e) {
            if (x < 1) {
                System.out.println("lutfen 0 dan buyuk bir sayi giriniz");
            }
        }
        return Faktoriyel;
    }
    //4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static Integer verilenIkiSayiArasindakiCiftSayilarinToplami(int x, int y) {

        if (x < y) {
            return IntStream.rangeClosed(x + 1, y - 1).filter(Utils::ciftElemaniSec).sum();
        } else {
            return IntStream.rangeClosed(y + 1, x - 1).filter(Utils::ciftElemaniSec).reduce(Math::addExact).getAsInt();
        }
    }
    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static Integer verilenSayilarArasindakiSayilarinToplami(int x, int y) {

        int z = 0;
        if (x>y){
            z = x;
            x = y;
            y = z;
        }
        return IntStream.rangeClosed(x+1,y-1).map(Utils::SayilarinRakamlariToplami).sum();
    }
}
