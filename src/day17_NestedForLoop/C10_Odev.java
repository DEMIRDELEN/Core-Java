package day17_NestedForLoop;

import java.util.Scanner;

public class C10_Odev {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından
        döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen sirayla bir isim ve bir karakter girin");

        String isim= scan.nextLine();
        String karakter= scan.next().substring(0,1);

        isim.replaceAll("\\W", ""); //javaherzamanguzel
        int icermeSayısı=0;

        for (int i = 0; i <=isim.length()-1; i++) {

                if (isim.substring(i,i+1).contains(karakter)){
                    System.out.print(isim.substring(i,i+1)+" ");
                    icermeSayısı++;
                }
        }
        System.out.println("");
        System.out.println("icermeSayısı = " + icermeSayısı);
    }
}
