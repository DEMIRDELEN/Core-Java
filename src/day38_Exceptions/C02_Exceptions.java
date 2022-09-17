package day38_Exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {

        int a = 100;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {

            /*
            try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri yazmak icin kullanılır.

            catch den son sonraki parantez karsılasmayı bekledigimiz exceptin turunu javaya soylemek icin kullanılır.

            Catch blogu : javaya soyledigimiz exception (istisna) gerceklesirse javanın yapmasını istedigimiz islem.

            catch blogunun onundeki paranteze karsılasmayı bekledigimiz exception ı yazabilir veya her turlu exception da
            devreye girmesini istiyorsak tum exceptionların parentı olan exception yazabiliriz.
             */
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println("0 olur dikkat et");
            }
            b--;
            sayac++;
        }
    }
}
