package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOException {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        javada bilgisayarımızdaki bir dosyaya erişmek istiyorsak FileİnputStream class ından yardım alırız.

        aynı şekilde javadan pc mizdeki bir dosyaya ekleme veya update yapmak istersek FileOutputStream class ından yardım alırız.
         */

        FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");

        /*
        goruldugu gibi compile time da altını kırmızı çizen her durum Compile Time Error degildir.

        Java da bazı exceptinlar da compile time exception dır

        Ozellikle dosya okuma ve yazma ile ilgili exceptionlar Compile time exception dır.


        compile time exception olustugunda java cozum icin iki ihtimal onerir.
        1-try-catch ile cevrelemek.
        2- method signature ina throws keyword ile beklenen exception turunu yazmak.

        throws exception, sadece olayın farkında oldugumuzun deklerasyonudur.
        exception ın handle edilmesinde hicbir rolü yoktur.
        yani try catch ile kontrol altına aldıgımız exceptionlarda kod çalışmaya devam ediyordu. Ancak throws exception yazdıgımızda java bir exception ile karsılaşırsa
        hiç bir şey yapmamışız gibi hata mesajı yayınlayıp, çalışmayı durdurur.


         */
    }

}
