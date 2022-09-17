package day30_Immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        /*
        bizim olusturdugumuz date ve time canli saaat veya tarih degildir. localtime.now kullandgımız satırda, o anki tarih ve saati alıp bizim variable a store eder.
         */

        Thread.sleep(3000);

        time1=LocalTime.now();
        System.out.println("3 saniye sonra: "+ time1);

        System.out.println(time1.getSecond());
        System.out.println(time1.plusSeconds(10000));
        System.out.println(time1.minusMinutes(200));
        System.out.println(time1.withHour(3));
    }
}
