package day18_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        int sayi=7;

        while (sayi<10){
            System.out.println(sayi);

            sayi++;
        }


        //while loop da işlem sayısı çıktıdan fazla, dowhileloop da bı sorun olmaz

        sayi=7;

        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);
    }

}
