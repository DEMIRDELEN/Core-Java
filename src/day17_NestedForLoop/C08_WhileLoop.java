package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
  kullanicidan toplanmak uzere sayilar alin
  sayilarin toplami 500'u gecince
  sayilarin toplamini ve kac sayi toplandigini su sekilde yazdirin

  13 sayi girdinz ve toplamlari 567
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");

        int toplam=0;
        int sayac=0;
        while (toplam<500){
            System.out.println("lütfen toplamak için sayı girin");
            int sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac+ " sayı girdiniz "+ toplam+" toplamı da bu");
    }
}
