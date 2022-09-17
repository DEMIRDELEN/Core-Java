package day11_StringManipulation;

public class C05_EndsWith {
    public static void main(String[] args) {

        String str= "Ah be java";

        System.out.println(str.endsWith("ava"));
        System.out.println(str.endsWith("be java"));
        System.out.println(str.endsWith("Ah be java"));
        System.out.println(str.endsWith(""));
    }
}
