package day06_Concatination;

public class C02_Concatenation {

    public static void main(String[] args) {

        String str = "java";
        String str1 = "güzeldir";
        int sayı1 = 5;
        int sayı2 = 4;

        System.out.println(str + " " + str1 + " " + sayı1 + sayı2);
        System.out.println(str + " " + str1 + " " + (sayı1 + sayı2));
        System.out.println(sayı1+sayı2+" "+ str);
        System.out.println(""+sayı1+sayı2+str1);

        System.out.println(" ");
        System.out.println(str.concat(str1));
        System.out.println(str.concat(" ").concat(str1));
        System.out.println(3*5>5);
        System.out.println(!(3*5>7));
    }
}
