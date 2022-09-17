package day14_MethodCreation;

public class C05_Odev {
    public static void main(String[] args) {
        //100 den küüçük tam sayı ve birden başla 3 ve 5 in katı olanları yazdır

        katYazdir();

    }

    private static void katYazdir() {

        for (int i = 1; i <=100 ; i++) {

            if (i%3==0 && i%5==0){
                System.out.println(i+"iki sayının da katı");
            } else if (i%3==0) {
                System.out.println(i+"sayı üçün katı");

            } else if (i%5==0) {
                System.out.println(i+"sayi beşin katı");
            }
        }

    }
}

