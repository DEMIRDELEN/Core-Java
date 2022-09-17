package day20_Array;

public class C01_LocalVariables {
    public static void main(String[] args) {
        int sayi=10;
        //System.out.println(sayiMethod); sayimethod method bir de oluşturulmuş local variabledır

        for (int i = 1; i <20 ; i++) {
            System.out.println(i);
        }
        //System.out.println(i); i loop da oluşturulmuş local bir variable dır. sadece loop içerisinde kullanılabilir.

      //static int sayiStatic=20;  static keyword sadece class levelda kullanılabilir.
        // methodların içinde static variable tanımlanamaz.
    }

    public static void method(){

        //System.out.println(sayi); sayi main method da oluşturulmuş lokal bir variable dir ve
        //sadece main method da geverlidir

        int sayiMethod=20;
    }
}
