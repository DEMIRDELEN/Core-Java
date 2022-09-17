package day39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;

        /*
        System.out.println(str);

        deger ataması yapmadan bir variable ı kullanmaya calisirsaniz java compile time da bunu fark eder ve size izin vermez.
         */

        str = null;
        // System.out.println(str.length()); //NullPointerException

        Object obj = "java java java";

        Integer sayi = (int) obj;
/*
        String str2 = "hava civa";
        Integer sayi2 = str2;
        java bazı casting islemlerine compile time da izin vermez.

        Ancak bazen syntax uygun olabilir. Bu durumda java kodun calismasina itiraz etmez.
 */
    }
}
