package day14_MethodCreation;

public class C03_Odev {
    public static void main(String[] args) {

        //10 ile 30 arasındaki sayıları arada virgül kullanarak yazdırın

        int a =10;
        int b =30;

        sayilariYazdir(a,b);
    }

    public static void sayilariYazdir(int a, int b) {

        for (int i = a; i <=b ; i++) {
            if (i>=10 && i<=29){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }
    }
}
