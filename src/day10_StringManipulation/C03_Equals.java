package day10_StringManipulation;

public class C03_Equals {
    public static void main(String[] args) {
        String str="Ali Can";
        String str1="ALİ CAN";
        String str2="Ali Can"+"";
        String str3="Ali Can";
        String str4=new String("Ali Can");

        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str.equals(str2));

        System.out.println(str==str4);
        System.out.println(str.equals(str4));

        System.out.println("yar bana yine");
    }
}
