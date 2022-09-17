package day10_StringManipulation;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {
         String str= "Ali Can";
         String str1= "ali can";
         String str2 = "ALI CAN";
         String str3= "Ali Can_";
         String str4="ALİ CAN";

        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str.equals(str3));
        System.out.println(str.equalsIgnoreCase(str4));

    }
}
