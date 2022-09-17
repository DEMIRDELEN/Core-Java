package Practice_day01;

import java.util.Scanner;

public class Q12_IfStatement02 {
    public static void main(String[] args) {
        /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */
        Scanner scan= new Scanner(System.in);

        System.out.println("lutfen not girin");

        double not= scan.nextDouble();

        if (not<0 || not>100) {
            System.out.println("böle bir not yok göt");
        } else if (not<60) {
            System.out.println("notunuz F");
        } else if (not<70) {
            System.out.println("notunuz D");
        } else if (not<80) {
            System.out.println("notunuz C");
        } else if (not<90){
            System.out.println("notunuz B");
        } else {
            System.out.println("notunuz A");
        }
    }
}
