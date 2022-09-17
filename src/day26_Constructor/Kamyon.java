package day26_Constructor;

public class Kamyon {
    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {

        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;

        /*
        bizim temel amacımız kamyonrunner da argument olarak girilen degerin kamyon
        class ında instance variable a atanmasıdır
        ancak scope konusunda ögrendigimiz gibi kamyon constructer scope unda oldugu icin
        instance marka ya gitmiyor

        bu karısıkligi gidermek icin instance variable lari belirli hale getirmemiz lazim
        java bunun icin this keyword u olusturmustur

        genel kullanım acısından this keyword u kodu herkesin anlamasını kolaylastırdıgı icin
        tercih edilir
         */
    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon() {

    }

    @Override
    public String toString() {
        return
                "\nmarka: " + marka +
                        "\nmodel: " + model +
                        "\nyil: " + yil +
                        "\nfiyat: " + fiyat;
    }
}
