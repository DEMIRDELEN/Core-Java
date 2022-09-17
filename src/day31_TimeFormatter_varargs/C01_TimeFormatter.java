package day31_TimeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih: "+ tarihsaat);

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/MM/YY hh:mm");

        System.out.println(dtf1.format(tarihsaat));

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm a");

        System.out.println(dtf2.format(tarihsaat));

        // tarihsaat= dtf2.format(tarihsaat);

        //sadece yazdırmaya yariyor
    }
}
