package day15_Overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        int toplam=0;

        for (int i = 30; i <=50 ; i+=2) {
            toplam+=i;
        }
        System.out.println(toplam);


        for (int i = 1500; i <=1600 ; i++) {
           if (i%7==0){
               toplam+=i;
           }
        }
        System.out.println(toplam);
    }
}
