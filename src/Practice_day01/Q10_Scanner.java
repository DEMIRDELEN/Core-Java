package Practice_day01;

import java.util.Scanner;

public class Q10_Scanner {

// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line

public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);

    System.out.println("lutfen isim girin");

    String isim= scan.nextLine();

    System.out.println("lutfen memleket girin");

    String memleket= scan.nextLine();

    System.out.println("lutfen konum girin");

    String konum= scan.nextLine();

    System.out.println("lutfen yaş girin");

    int yaş= scan.nextInt();

    System.out.println("lutfen boy girin");

    double boy= scan.nextDouble();

    System.out.println("yaşadığınız yeri seviyor musunuz--true/false");

    boolean seviyorMu= scan.hasNextBoolean();


    System.out.println("isim = " + isim);
    System.out.println("memleket = " + memleket);
    System.out.println("konum = " + konum);
    System.out.println("yaş = " + yaş);
    System.out.println("boy = " + boy);
    System.out.println("seviyorMu = " + seviyorMu);
}
}
