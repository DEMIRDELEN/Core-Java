package day07_İfStatements;

import java.util.Scanner;

public class C08_İfElseİf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yaş gir");

        int yas= scan.nextInt();

        if (yas<0){
            System.out.println("geçerli yaş yaz aq");
        } else if (yas>=65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("hee oldun bak (!) "+(65-yas)+ " yıl daha çalışcan");
        }

    }
}
