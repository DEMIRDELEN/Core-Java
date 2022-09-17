package day14_MethodCreation;

public class C04_Odev {
    public static void main(String[] args) {
        //100 den aşlayarak 50 ye kadar olan sayıları virgül kullanarak yazdırın

        int a=100;
        int b=50;

        sayiYaz(a,b);

    }

    public static void sayiYaz(int a, int b) {

        for (int i = a; i >=b ; i--) {
            if (i<=100 && i>=51){
                System.out.print(i+",");
            }else {
                System.out.print(i);
            }
        }
    }
}
