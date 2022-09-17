package day16_forLoop;

public class C15_Odev {
    public static void main(String[] args) {

        int bas=100;
        int son=250;

        int buyuk=Math.max(bas,son);
        int kucuk=Math.min(bas,son);

        while (kucuk<=buyuk){
            if (kucuk%2==0){
                System.out.println(kucuk);
            }
            kucuk++;
        }
    }
}
