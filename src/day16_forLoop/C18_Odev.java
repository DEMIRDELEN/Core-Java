package day16_forLoop;

import java.util.Scanner;

public class C18_Odev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin");
        int x=scan.nextInt();
        int kaçTane=0;

        for (int i = 1; i <=x ; i++) {
            if (x%i==0){
                System.out.print(i+" ");
                kaçTane++;
            }
        }

        System.out.println("");
        System.out.println("kaçTane = " + kaçTane);
    }
}
