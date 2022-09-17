package day32_stringBuilder;

public class C03_Reverse {

    public static void main(String[] args) {
        String input = "hey gidi for loop gunleri";
        String ters = terscevir(input);
        System.out.println(ters);
    }

    public static String terscevir(String input) {
        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();

    }

}
