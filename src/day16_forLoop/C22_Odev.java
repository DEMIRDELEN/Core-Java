package day16_forLoop;

import java.util.Scanner;

public class C22_Odev {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("isim girin");
        String str =scan.nextLine();

        String str2="";

        for (int i = str.length()-1; i >=0 ; i--) {

            str2+= str.substring(i,i+1);

        }

        if (str.equals(str2)){
            System.out.println("stringimiz palindrome bir string");
        } else {
            System.out.println("stringimiz palindrome değil");
        }
    }

}
