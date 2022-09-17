package Practice_day02;

public class Q04_ForLoop {
    public static void main(String[] args) {

        int toplam=0;

        for (int i = 100; i >=0 ; i--) {

            if (i%13==0){

                System.out.print(i+" ");

                toplam+=i;

            }

        }

        System.out.println("");

        System.out.println("toplam = " + toplam);
    }
}
