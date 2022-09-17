package day12_StringManipulation;

public class C04_Substring {
    public static void main(String[] args) {

        String str= "java cok yasa";

        System.out.println(str.substring(3,4));
        System.out.println(str.substring(5,7));
        System.out.println(str.substring(6,6)); //"" boş

        // System.out.println(str.substring(6,2)); StringIndexOutOfBoundsException

        String s= "rock";
        s.toUpperCase();
        System.out.println(s);
    }
}
