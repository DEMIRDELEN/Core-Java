package day40_Final;

public class A {
    String isim = "cuneyt";
    final static String OKUL = "yildiz Koleji";
    /*
    bir variable final olarak tanımlandıysa baska classlardan veya icinde oldugumuz classtan bu variable a baska deger atanması mumkun degildir.

    mademki degeri degistirilemiyor genelde static de yaparak bu variable a erisim kolaylastırılabilir.

    hem final hem staticse variable isminin tamamı büyük yazılır.
     */
    final void finalMethod(){
        System.out.println("final methodlar override edilemez.");
    }
    /*
    bir method u final olarak işaretlersek
    bu method degistirilemez demektir.
     */

}
