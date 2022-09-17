package day25_Constructor;

public class C01 {

    /*
    java oop konsept kullandığı icin olsuturulan her bir class ın ihtiyac oldugunda obje
    uretebilmesine uygun dizayn etmistir ama her class dan obje uretilmeyebilir, bunun icin java
    ihtiyac halinde kullanılması icin her class da default bir constructor koymustur

    bu default constructor class dan obje olusturuldugunda otomatik olarak calısır

    örnegin bu class da constructor görünmemesine ragmen c02 class ında icinde oldugumuz
    c01 class ından bir obje uretebildik
     */


  int sayi;

  public void deneme(){
      System.out.println("C01 den deneme metodu calisir");
  }

}
