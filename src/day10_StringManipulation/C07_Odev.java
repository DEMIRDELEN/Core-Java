package day10_StringManipulation;

import java.util.Locale;

public class C07_Odev {
    public static void main(String[] args) {

        String str="hadi";
        String str1= new String("ali can");
        String str2="çalışırsan, java öğrenmek çok kolay";
        System.out.println(str.concat(" "+str1).toUpperCase(Locale.forLanguageTag("Tr")));
        System.out.println(str.length());
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("t"));

        System.out.println(str2.indexOf("java"));
        System.out.println(str2.indexOf("ç",11));
    }
}
