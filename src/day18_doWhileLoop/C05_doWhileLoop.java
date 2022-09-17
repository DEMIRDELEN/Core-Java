package day18_doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {


        int bas = 9;
        int bitis = 190;
        int temp = bas;

        while (temp < bitis) {
            if (temp % 7 == 0) {
                System.out.println(temp + " ");

            }
            temp++;
        }

        System.out.println("");
        temp = bas;

        do {
            if (temp % 5 == 0) {
                System.out.println(temp + " ");
            }
            temp++;

        }while (temp < bitis) ;
    }
}
