package Practice_day13_InterviewQuestion;

import java.util.Scanner;

public class Q01 {
    /*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

      soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
      amstrong sayı olup olmadıgını
      gösteren program yazınız */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        armstron(sayi);
        girilenSayiyaKadarOlanArmstrongSayilar(sayi);
    }

    public static void girilenSayiyaKadarOlanArmstrongSayilar(int sayi) {

        for (int i = 0; i <=sayi ; i++) {
            armstron(i);
        }
    }

    public static void armstron(int sayi) {
        int sayininKuplerToplami = 0;
        int basamaktakiSayi = 0;
        int girilenSayi = sayi;
        int basamagınKupu = 0;

        while (sayi > 0) {
            basamaktakiSayi = sayi % 10;
            sayininKuplerToplami += (basamaktakiSayi * basamaktakiSayi * basamaktakiSayi);
            sayi/=10;
        }

        if (sayininKuplerToplami==girilenSayi){
            System.out.println("sayimiz: "+girilenSayi+" -sayimiz armstrong bir sayidır");
        } else {
            System.out.println("sayimiz: "+girilenSayi+" -sayimiz armstrong bir sayi degil");
        }
    }

}
