package day26_Constructor;

public class Araba {

    public String marka = "marka belirtilmedi";
    public String model = "model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) {
        marka=markaR;
        model=modelR;
        yil=yilR;
        fiyat=fiyatR;
    }
    public Araba(){

    }
    /*
    biz herhangi bir consstructor olusturdugumuzda java default constructor ı siler
    eger biz projemizde bir sorun yaşanmasını istemiyorsak mutlaka default
    constructor yerine parametresiz bir constructor olusturmalıyız
     */

    public void benzinliarac() {
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHız(int hız) {
        System.out.println("bu araba max " + hız + " km hız yapar");
    }
}