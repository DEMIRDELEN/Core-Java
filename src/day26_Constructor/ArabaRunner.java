package day26_Constructor;

import day25_Constructor.C05_Car;

public class ArabaRunner {
    public static void main(String[] args) {

        // bir gun onceki car class ından obje olusturalım

        C05_Car car1 = new C05_Car();
        System.out.println("car1.fiyat = " + car1.fiyat);

        // farklı bir package daki bir class dan obje
        // olusturdugumuzda access modifier lari da dikkate almalıyız

        /*
        araba class ından bir obje olusturdugumda eger default constructor kullanıldıysa
        tum özellikler icin tek tek deger atamak zorunda kalırız
         */

        Araba araba1 = new Araba();

        araba1.fiyat = 100000;
        araba1.marka = "mercedes";
        araba1.yil = 2010;
        araba1.model = "C180";

        System.out.println("marka : " + araba1.marka + "\nModel : " +
                araba1.model + "\nyil :" + araba1.yil + "\nfiyat :" + araba1.fiyat);

        /*
        EGER BİR OBJEYİ OLUSTURURKEN BAZI OZELLİKLERİNİ ARGUMENT OLARAK BELİRTİP O
        OZELLİKLERDE BİR OBJE OLUSTURMAK İSTERSEK JAVA ITIRAZ EDER. CUNKU HER CLASSTA
        DEFAULT CONSTROCTUR VARDIR AMA O DA ARGUMENTSİZDİR. BİZİM YENİ VE ARGUMENTLİ CONSTRUCTOR
        LARA İHTİYACIMIZ VAR.
         */
        System.out.println("");
        Araba araba2 = new Araba("BMW","5,20",2011,15000);

        System.out.println("marka : " + araba2.marka + "\nModel : " +
                araba2.model + "\nyil :" + araba2.yil + "\nfiyat :" + araba2.fiyat);

        System.out.println("");

        Araba araba3= new Araba("opel","astra",2015,78000);

        System.out.println("Araba3 bigiler\nmarka : " + araba3.marka + "\nModel : " +
                araba3.model + "\nyil :" + araba3.yil + "\nfiyat :" + araba3.fiyat);

        System.out.println("");

        Araba araba4= new Araba("AUDİ","A5",2020,50000);

        System.out.println("Araba4 bigiler\nmarka : " + araba4.marka + "\nModel : " +
                araba4.model + "\nyil :" + araba4.yil + "\nfiyat :" + araba4.fiyat);
    }
}
