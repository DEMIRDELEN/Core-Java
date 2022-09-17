package day18_doWhileLoop;

public class C07_Odev {
    public static void main(String[] args) {

        int sayi=9;
        do {
            if (sayi%7==0){
                System.out.println(sayi+" ");
            }
            sayi++;
        }while (sayi<=190);
    }
}
