package day41_AbstractClass_Interface;

public class HA160 extends FMercedes {
    /*
    abstract parent silsilesinden gelen ilk concrete class parent ı olan tum classlardaki
    abstract methodları concrete hale donusturmek yani override etmek zorundadır.

    bu kuralın istisnası parent classlardan herhangi birinde concrete hale donusturulmus, abstract methodlardır.
     */
    HA160 arb1 = new HA160();
    // concrete bir class dan istedigimiz objeyi uretebiliriz.

    /*
    abstract bir class ın ozelliklerini tasıyan bir obje olusturmak istedigimizde data turunu istedigimiz abstract class
    constructor i ise child i olan concrete bir clastan seçeriz.
     */

    EToyota arb4 = new GCorolla();
}
