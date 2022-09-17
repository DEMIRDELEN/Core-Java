package day40_Final;

final public class B extends A {
    public static void main(String[] args) {

        B obj = new B();
        obj.isim = "Alp";
        //obj.okul = "java Koleji";

        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        bir class final olarak belirlenirse o class inherit edilemez
         */
    }
}
