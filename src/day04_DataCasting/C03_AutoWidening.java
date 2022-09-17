package day04_DataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        char harf='b';
        char harf2= harf;

        System.out.println(harf);

        byte num1=12;
        short num2= num1;
        int num3= num2;
        float num4=num3;
        double num5=num4;

        System.out.println(num5);

        byte sayı4=5;
        short sayı5=55;

        double sayı6= sayı4*sayı5;

        sayı6 = sayı4 / sayı5 ;

        sayı6 = (double) sayı4 / sayı5 ;

        System.out.println(sayı6);

        System.out.println((int) sayı4*sayı5);
    }
}
