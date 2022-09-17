package Practice_day10.Okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

    public static void main(String[] args) {

        System.out.println("Hosgeldiniz okulumuza ");

        Scanner scan = new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim = scan.nextLine();

        System.out.println("lutfen soy isim giriniz");
        String soyİsim = scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("lutfen bransinizi giriniz");
        String brans = scan.nextLine();

        System.out.println("lutfen tel no giriniz");
        String tel = scan.nextLine();

        OgretmenBilgileri adayogretmen = new OgretmenBilgileri(isim, soyİsim, yas, brans, tel);

        List<OgretmenBilgileri> ogretmenList = new ArrayList<>();
        ogretmenList.add(adayogretmen);

        System.out.println(ogretmenList);


    }

}
