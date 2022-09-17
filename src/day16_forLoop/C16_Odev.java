package day16_forLoop;

import java.util.Scanner;

public class C16_Odev {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("ilk ve ikinci harfi girin");
        char x=scan.next().charAt(0);
        char y=scan.next().charAt(0);


        if (y>=x){
            for (char i =x; i <=y ; i++) {

                System.out.println(i);

            }
        } else {
            for (char i =y; i <=x ; i++) {

                System.out.println(i);

            }
        }

    }
}
