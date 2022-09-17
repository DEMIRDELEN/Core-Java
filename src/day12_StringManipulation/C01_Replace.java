package day12_StringManipulation;

public class C01_Replace {
    public static void main(String[] args) {

        String str= " bu gun ha va cok guz el ";

        System.out.println(str.replace(" ",""));
        System.out.println(str.replace("h","j").replace(" ",""));
        System.out.println(str.replace("guz el","harika"));

        str= str.replace(" bu gun", "bugun")
                .replace("ha va", "java")
                .replace("guz el","guzel");
        System.out.println(str);
    }
}
