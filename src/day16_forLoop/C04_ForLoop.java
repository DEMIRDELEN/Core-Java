package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen 100 den kucuk bir tamsayı girin");

        int sayi= scan.nextInt();

        for (int i = 1; i <sayi ; i++) {
            if (i%3==0 && i%5==0){
                System.out.print("java gözeldir"+"\n");
            } else if (i%5==0) {
                System.out.print("güzeldir"+" ");
            } else if (i%3==0) {
                System.out.print("java"+" ");
            }else {
                System.out.print(i+" ");
            }

        }
    }
}
