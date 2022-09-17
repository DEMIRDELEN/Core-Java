package day25_Constructor;

public class C05_Car {

    /* bu class kalıphane
    bir araba olsturmak icin ihtiyacımız olan variable ve methodları bu class da belirleriz

    sonra farklı classlarda araba olsturmamız gerekirse bu classtan bir obje olusturup
    burada belirlenen method ve variable lara göre araba uretiriz

     */

   public String marka="marka belirtilmedi";
    public String model="model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliarac(){
        System.out.println("bu arac benzinli motora sahiptir");
    }

    public void maxHız(int hız){
        System.out.println("bu araba max "+ hız+ " km hız yapar");
    }
}
