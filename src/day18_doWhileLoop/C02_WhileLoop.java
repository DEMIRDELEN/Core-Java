package day18_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {

        int input= 54321;

        int toplam=0;

        int birlerBasamağı=0;

        int temp=input;


        while (temp>0) {
            birlerBasamağı=temp%10;
            toplam+=birlerBasamağı;
            temp/=10;
        }

        System.out.println("toplam = " + toplam);
    }
}
