package day17_NestedForLoop;

public class C15_Odev_ebob {
    public static void main(String[] args) {
        int sayi1=220;
        int sayi2=413;

        ebobBul(sayi1,sayi2);
    }

    public static void ebobBul(int sayi1, int sayi2) {
        int ebob=0;
        int kucuk=Math.min(sayi1,sayi2);

        for (int i =1; i <=kucuk ; i++) {
            if (sayi1%i==0 && sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println(ebob);
    }

}
