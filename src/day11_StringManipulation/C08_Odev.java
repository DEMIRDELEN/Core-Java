package day11_StringManipulation;

import java.util.Scanner;

public class C08_Odev {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir cümle girin");

        String cumle = scan.nextLine();

        System.out.println("lütfen harf girin");

        char harf = scan.next().charAt(0);

        if (cumle.lastIndexOf(harf) == -1) {

            System.out.println("harf cümlede geçmiyor");
        } else {
            System.out.println("harf cümlede geçiyor");
        }
    }
}
