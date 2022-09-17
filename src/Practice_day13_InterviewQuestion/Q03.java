package Practice_day13_InterviewQuestion;

import java.util.Scanner;

public class Q03 {
    /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir string girin");
        String str = scan.nextLine();

        palindrome(str);
    }

    public static void palindrome(String str) {

        String ters = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ters += str.charAt(i);
        }

        if (str.equals(ters)) {
            System.out.println("Stringimiz polindrome");
        } else {
            System.out.println("Stringimiz polindrome değil");
        }
    }
}
