package Practice_day06;

import java.util.Scanner;

public class Q04_DoWhileLoop {
    public static void main(String[] args) {
         /*
Ask user to enter a word. If the word has odd number of characters
 and has 3 or more characters,
 print the character in the middle of the word.
 the word has even number of character print "You entered wrong word."
     INPUT      :   celik
     OUTPUT    :   l
     INPUT      :   elif
     OUTPUT    :   You entered wrong word.*/

        Scanner scan = new Scanner(System.in);
        String kelime="";
        do {
            System.out.println("kelime giriniz");
            kelime = scan.nextLine();

            if (kelime.length()<3){
                System.out.println("kelime 3 ve daha fazla karakter olmalı");
            }else {
                if (kelime.length()%2==1){
                    System.out.println("Ortadaki karakter: "+
                            kelime.substring(kelime.length()/2,kelime.length()/2+1));// charAt(kelime.lenght/2)
                } else {
                    System.out.println("kelime cift karakterli, tekrar giriniz");
                }
            }

        }while (!(kelime.length()>=3 && kelime.length()%2==1));





      //  Scanner scan = new Scanner(System.in);
      //  String word ="";
      //  do {
      //      System.out.println("lutfen bir kelime giriniz :");
      //      word = scan.nextLine();
      //      if(word.length()<3){
      //          System.out.println("girilen word 3 karakterden az");
      //      }if(word.length()%2==1  && word.length()>=3){
      //          System.out.println("ortadaki karakter :" +word.charAt(word.length()/2));
      //      }else{
      //          System.out.println("You entered wrong word.");
      //      }
      //  }while(!(word.length()%2==1  && word.length()>=3));

    }
}
