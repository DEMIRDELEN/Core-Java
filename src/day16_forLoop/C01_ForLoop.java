package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        //verilen pozitif tam sayinin
        //tam bölenlerini yazdıralim

        int input=5;
        int toplam=0;

        for (int i = 1; i <=input ; i++) {
            if (input%i==0){
                toplam+=i;
            }

        }            System.out.println("toplam = " + toplam);

    }
}
