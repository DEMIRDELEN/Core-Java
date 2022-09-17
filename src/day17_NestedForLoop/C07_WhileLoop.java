package day17_NestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // başlangıç değeri bitiş şartı artış yada
        // azalış do loop while loop ve for loop da mutlaka var

        int bas = 20;
        int bitis = 50;
        for (int i = bas; i <= bitis; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");

        int temp = bas;
        while (temp <= bitis) {
            if (temp % 2 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        }
    }
}