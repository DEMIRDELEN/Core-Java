package day17_NestedForLoop;

public class C11_Odev {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :

30

40

Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
         */

        int sayi1=30;
        int sayi2=40;

        enKucukKat(sayi1,sayi2);

    }

    public static void enKucukKat(int sayi1, int sayi2) {

        int buyuk= Math.max(sayi1,sayi2);
        int ekok=0;
        for (int i = buyuk; i <=sayi1*sayi2 ; i++) {
            if (i%sayi1==0 && i%sayi2==0){
                ekok=i;
                break;
            }
        }
        System.out.println("ekok = " + ekok);
    }
}
