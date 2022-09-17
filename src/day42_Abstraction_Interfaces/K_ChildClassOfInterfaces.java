package day42_Abstraction_Interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces {
    /*
    Bir class ı interface e child yapmak icin implemenets keyword kullanılır.
    Implements dedikten sonra virgul kadar inteface ekleyebiliriz.

    Bir interface bir class ı parent edinemez.
     */

    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);
        System.out.println(I02_Interfaces.SAYI);
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
