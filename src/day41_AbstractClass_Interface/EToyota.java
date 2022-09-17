package day41_AbstractClass_Interface;

public abstract class EToyota extends DAraba{

    @Override
    public void motor() {
        System.out.println("toyota arabalar cevreci motor kullanır.");
    }
    /*
    parent class daki standart belirleyici methodlar (abstract method) ların tamamı child class tarafından override edilmelidir.

    concrete methodların override edilme mecburiyeti yoktur. istersek override edebiliriz istemezsek etmeyiz.

    Aslında toyota class ı da obje ureteceğimiz bir class degil, bu durumda eger proje tasarımı yapıyorsanız
    toyota class ını da abstract yapmanız guzel olur.
     */

   // EToyota arb3= new EToyota();
    // abstract classlar constructer barındırır ama obje uretemezler.
    // Toyota class ı abstract class oldugundan obje uretilemez.
}
