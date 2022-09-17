package day07_İfStatements;

import java.util.Scanner;

public class C15_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("not girin");

        double not= scan.nextDouble();

        if (not>80 && not<=100) {
            System.out.println("notunuz: A");
        } else if (not>=60 && not<=80) {
            System.out.println("notunuz: B");
        } else if (not>=50 && not<60) {
            System.out.println("notunuz: C");
        } else if (not>=0 && not<50) {
            System.out.println("notunuz: D");
        } else {
            System.out.println("lutfen gecerli bir not giriniz");
        }

    }
}
