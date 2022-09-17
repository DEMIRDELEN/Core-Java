package day16_forLoop;

public class C13_Odev {
    public static void main(String[] args) {


        for (int i = 100; i <=999 ; i++) {

            if (i%15==0 && i%20==0 && i%90==0){
                System.out.println(i);
            }

        }
    }
}
