package day16_forLoop;

public class C14_Odev {

    public static void main(String[] args) {

        int x=100;

        while (x<=999){

            if (x%15==0 && x%20==0 && x%90==0){

                System.out.println(x);
            }

            x++;
        }
    }
}
