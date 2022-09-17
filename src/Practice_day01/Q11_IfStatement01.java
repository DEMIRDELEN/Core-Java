package Practice_day01;

import java.util.Scanner;

public class Q11_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen Y ya da N girin");

        char karakter= scan.next().toUpperCase().charAt(0);

        if (karakter=='Y'){
            System.out.println("YES");
        } else if (karakter=='N'){
            System.out.println("NO");
        }else {
            System.out.println("siktir git aq");
        }

        System.out.println("lutfen Y ya da N girin");

        char karakter1= scan.next().charAt(0);

        if (karakter1=='Y' || karakter1=='y'){
            System.out.println("YES");
        } else if (karakter1=='N' || karakter1=='n'){
            System.out.println("NO");
        }else {
            System.out.println("siktir git aq");
        }
    }
}
