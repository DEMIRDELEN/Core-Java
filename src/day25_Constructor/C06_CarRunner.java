package day25_Constructor;

public class C06_CarRunner {
    public static void main(String[] args) {

        C05_Car car1 = new C05_Car();

        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="toyota";

        System.out.println("marka : "+ car1.marka+ "\nModel : "+
                car1.model+ "\nyil :"+ car1.yil+ "\nfiyat :"+ car1.fiyat);

        C05_Car car2 =new C05_Car();

        System.out.println("marka : "+ car2.marka+ "\nModel : "+
                car2.model+ "\nyil :"+ car2.yil+
                "\nfiyat :"+ car2.fiyat);

        /* herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi
        2- objein olusturuldugu classda variable a bir deger atanmış mı bakar
        3- o zaman data turune göre java default degeri atar
         */
    }
}
