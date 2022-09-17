package Practice_day11_Interviwe_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string giriniz");
        String str = scan.nextLine();

        String arr[] = str.split("");
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int sayac=1;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                sayac++;
            } else {
                System.out.println(arr[i-1]+" karakteri "+sayac);
                sayac=1;
            }
            if (i==arr.length-1){
                System.out.println(arr[i]+" karakteri "+sayac);
            }
        }


    }
}
