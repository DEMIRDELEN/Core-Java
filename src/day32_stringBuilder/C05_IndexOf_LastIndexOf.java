package day32_stringBuilder;

public class C05_IndexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("paye attention please");
        System.out.println(sb.indexOf("pay"));
        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e",10));
        System.out.println(sb.lastIndexOf("e"));
        System.out.println(sb.lastIndexOf("e",10));
    }
}
