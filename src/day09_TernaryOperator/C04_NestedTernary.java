package day09_TernaryOperator;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen harf girin");

        char harf = scan.next().charAt(0);

        String sonuc= (harf>= 'a' && harf<='z') ? ("küçük harf") :
                      ((harf>= 'A' && harf<='Z') ? ("buyuk harf") : ("geçersiz karakter")) ;

        System.out.println(sonuc);
    }
}
