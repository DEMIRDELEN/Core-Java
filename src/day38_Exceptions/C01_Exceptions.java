package day38_Exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        /*
        bir sorunla karşılaşmayı beklediginiz noktalarda if else ile sorunu yakalayıp onunla ilgili cozum uretebilirsiniz.

        Ancak sorunu her zaman if else ile cozemeyecegimizden java try-Catch blockları olusturmustur.
         */
        int a = 100;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {

            if (b==0){
                System.out.println("islem yapılırken payda 0 oldu dikkat etmelisiniz");
            } else {
                System.out.println(a / b);
            }

            b--;
            sayac++;
        }

    }
}
