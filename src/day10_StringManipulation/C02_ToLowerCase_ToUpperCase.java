package day10_StringManipulation;

import java.util.Locale;

public class C02_ToLowerCase_ToUpperCase {
    public static void main(String[] args) {

        String str= "beni psikopata bağlamayın";

        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr"))); // locale dil seçersen bu method

        System.out.println(str.equals("s"));
    }
}
