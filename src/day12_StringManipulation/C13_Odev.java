package day12_StringManipulation;

import java.util.Scanner;

public class C13_Odev {
    public static void main(String[] args) {
       /* Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri gerçekleştiren bir switch ifadesi yazın:

        yanıt a ise,

                "Talebiniz işleniyor" mesajı yazdırılır

        yanıt b ise,

                "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır yanıt c ise,

                "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır

        başka herhangi bir yanıt değeri için,

        "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır*/

        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen karakter girin");

        char kr= scan.next().charAt(0);

        switch (kr){
            case 'a':
                System.out.println("Talebiniz işleniyor");
                break;
            case 'b':
                System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            case 'c':
                System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
                break;
            default:
                System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
        }
    }
}
