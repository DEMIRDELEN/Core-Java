package Practice_day02;

import java.util.Scanner;

public class Q08_ForLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen kelime girin");
        String x=scan.nextLine();

        testenYaz(x);
    }

    public static void testenYaz(String x) {

        for (int i = x.length()-1; i >=0 ; i--) {

            System.out.print(x.substring(i,i+1));

        }
    }




     //   /* Interview Question
     //    Write a Java program to reverse a string. Use for loop and create a method called
     //     reverseString */
     //   public static void main(String[] args) {
     //       Scanner scan = new Scanner(System.in);
     //       System.out.println("bir string giriniz :");
     //       String str = scan.nextLine();
     //       System.out.println("string in tersi :" + reverseString(str));
     //   }
     //   private static String reverseString(String str) {
     //       String reversed = "";
     //       for (int i = str.length() - 1; i >= 0; i--) {
     //           reversed+=str.charAt(i);
     //       }
//
     //       return reversed;
     //   }
    }

