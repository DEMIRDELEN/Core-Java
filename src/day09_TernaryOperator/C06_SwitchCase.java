package day09_TernaryOperator;

import java.util.Locale;
import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        String input= "pazartesi";
        input=input.toLowerCase();

        switch (input){

            case "pazartesi" :
                System.out.println("haftaiçi");
                break;
            case "salı" :
                System.out.println("haftaiçi");
                break;
            case "çarşamba" :
                System.out.println("haftaiçi");
                break;
            case "perşembe" :
                System.out.println("haftaiçi");
                break;
            case "cuma" :
                System.out.println("haftaiçi");
                break;
            case "cumartesi" :
                System.out.println("haftasonu");
                break;
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lütfen gün gir");
        }



        switch (input){

            case "pazartesi" :
            case "salı" :
            case "çarşamba" :
            case "perşembe" :
            case "cuma" :
                System.out.println("haftaiçi");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("lütfen gün gir");
        }
    }
}
