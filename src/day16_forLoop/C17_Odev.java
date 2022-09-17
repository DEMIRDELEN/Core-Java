package day16_forLoop;

import java.util.Scanner;

public class C17_Odev {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi girin");
        int x=scan.nextInt();

        int çarpım=0;

        while (çarpım<=10){

            System.out.println(""+çarpım+"*"+x+"="+ (çarpım*x));

            çarpım++;
        }
    }
}
