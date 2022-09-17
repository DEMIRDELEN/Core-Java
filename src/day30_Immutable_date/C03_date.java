package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class C03_date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        System.out.println(tarih);

        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println(tarih.getDayOfWeek());
        System.out.println(tarih.getMonthValue());
        System.out.println(tarih.isLeapYear());

        LocalDate tarih2 = LocalDate.of(2001,06,26);
        System.out.println(tarih2);

        LocalDate tarih3 = LocalDate.of(2010, Month.AUGUST,26);
        System.out.println(tarih3);

        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20));

        System.out.println(tarih.minusDays(100).minusMonths(5).plusMonths(2));

        System.out.println(tarih.isAfter(tarih2));

        System.out.println(tarih.lengthOfYear());

        //iki farkli dogum gunu girildiginde hangisinde doganın daha buyuk oldugunu bulunuz


    }
}
