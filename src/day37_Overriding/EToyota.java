package day37_Overriding;

public class EToyota extends DAraba {

    protected void marka() {
        //super.marka();
        System.out.println("arabaların markası toyotadır.");
    }
    /*
    eger hem overriden hem de overriding method un calismasini istersem, ilk satıra super.marka() yazabiliriz.
     */
    protected void motor() {
        System.out.println("toyota araçlar toyota marka motor kullanır.");
    }

}
