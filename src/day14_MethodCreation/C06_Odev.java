package day14_MethodCreation;

public class C06_Odev {
    public static void main(String[] args) {
        int a = 1;
        int b = 100;

        yazdirGeç(a,b);
    }

    public static void yazdirGeç(int a, int b) {

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i+" üçün ya da beşin katı");
            }
        }
    }
}