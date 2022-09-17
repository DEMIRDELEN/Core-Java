package Practice_day06;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String harf="";

        do {
            System.out.println("harf giriniz");
            harf = scan.next().toLowerCase().substring(0,1);
            if (harf.equals("x")){
                System.out.println("program bitti");
            } else {
                System.out.println("program calisiyor");
            }
        }while(!harf.equals("x"));
    }
}
