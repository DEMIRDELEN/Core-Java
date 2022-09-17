package day17_NestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
         int input=4;

        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
