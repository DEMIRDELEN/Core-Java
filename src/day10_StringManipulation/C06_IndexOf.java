package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {

        String str= "calisirsaniz, Java ogrenmek cok kolay";

        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("ç"));
        System.out.println(str.indexOf("c"));

        String str1="asflerwtwyeueurtyelryeuoetpueuğreyrelyeuletltputrluörpyepurğurğuöytşlö";

        if (str1.indexOf("p")==-1) {
            System.out.println("istenen karakter kullanılmamış");

        }else {
            System.out.println("istenen karakter kullanılmış");
        }

    }
}
