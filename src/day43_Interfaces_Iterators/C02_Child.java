package day43_Interfaces_Iterators;

public class C02_Child implements I01_InterfaceBodyOlanMethod {
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
    /*
    Parent interface de abstract olan 3 methodu implement ettigimizde java itirazını durdurur.

    sonradan eklediğimiz default veya static keyword ile tanımladıgımız methodları implement etmememiz sorun olusturmadı.
     */

    public static void main(String[] args) {
        I01_InterfaceBodyOlanMethod.direksiyon();
        C02_Child obj = new C02_Child();
        obj.teker();
        System.out.println(I01_InterfaceBodyOlanMethod.isim);
    }
}
