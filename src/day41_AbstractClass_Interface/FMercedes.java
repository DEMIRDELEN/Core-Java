package day41_AbstractClass_Interface;

public class FMercedes extends DAraba {
    @Override
    protected void yakit() {
        /*
        abstract bir parent ın concrete child class ınherit ederse
        parent abstract class daki tum abstract methodlari override etmek zorundadır.

        abstract ir class abstract baska bir class ı parent edinirse parent class daki tum abstract methodları override etmek zorunda degildir.

         */
    }

    @Override
    protected void kaporta() {

    }

    @Override
    public void motor() {

    }

    FMercedes arb2 = new FMercedes();
    //mercedes de concrete
}
