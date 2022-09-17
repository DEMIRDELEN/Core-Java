package day16_forLoop;

import java.util.Scanner;

public class C20_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isim girin");
        String str =scan.nextLine();

        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));

        }
    }
}
