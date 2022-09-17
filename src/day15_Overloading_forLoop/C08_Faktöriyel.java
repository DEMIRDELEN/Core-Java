package day15_Overloading_forLoop;

public class C08_Faktöriyel {
    public static void main(String[] args) {
        int input=10;

        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {
        int faktoriyel=1;

        if (input<0 || input>20){
            System.out.println("siktir lan");
        } else if (input==0){
            System.out.println("0!=1'dir");
        }else {
            for (int i = 1; i <= input; i++) {
                faktoriyel*=i;
            }
            System.out.println(faktoriyel);
        }
    }
}
