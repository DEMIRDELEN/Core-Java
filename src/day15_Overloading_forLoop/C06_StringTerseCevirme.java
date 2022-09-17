package day15_Overloading_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        String input="ey edip adanada pide ye";

        terstenYazdır(input);
    }

    public static void terstenYazdır(String input) {
        String tersinput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >= 0; i--) {
            tersinput+=input.substring(i,i+1);

        }
        System.out.println(tersinput);
        }
    }

