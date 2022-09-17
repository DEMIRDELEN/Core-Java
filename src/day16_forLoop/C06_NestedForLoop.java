package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 2; i++) {
            System.out.print("* ");

        }
        System.out.println("\n");
        for (int i = 0; i <= 3; i++) {
            System.out.print("* ");

        }
        System.out.println("\n");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }

    }
}
