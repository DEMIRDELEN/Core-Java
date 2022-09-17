package day16_forLoop;

public class C07_Odev {
    public static void main(String[] args) {

        String isim="hasigome";

        terstenYazdir(isim);
    }

    private static void terstenYazdir(String isim) {

        String tersisim="";

        for (int i = isim.length()-1 ; i >=0; i--) {

            tersisim+=(isim.substring(i, i + 1));
        }

        System.out.println(tersisim);
    }
}
