package day17_NestedForLoop;

public class C14_odev_ekok {
    public static void main(String[] args) {
        int x=1;
        int y=55;

        ekokAl(x,y);
    }

    public static void ekokAl(int x, int y) {

        int ekok=0;
        int buyuk=Math.max(x,y);

        for (int i =buyuk; i <=x*y ; i++) {

            if (i%x==0 && i%y==0) {
                ekok=i;
                break;
            }
        }
        System.out.println(ekok);
    }
}
