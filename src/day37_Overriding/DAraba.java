package day37_Overriding;

public class DAraba {

    protected void yakit(){
        System.out.println("tum arabalar yakıt kullanır.");
    }
    // parent class dan override edilmesini istemediginiz methodları private static veya final yapabilirsiniz.
    protected void marka(){
        System.out.println("tum arabaların markası vardır.");
    }
    protected void motor() {
        System.out.println("tum arabaların motoru vardır.");
    }
}
