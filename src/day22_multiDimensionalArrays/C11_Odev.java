package day22_multiDimensionalArrays;

public class C11_Odev {
    public static void main(String[] args) {

        //tum elemanlarin carpimini ekrana yazdiran bir method yap

        int sayilar[][]={{1,2,3},{4,5,6}};

        carpimYazdir(sayilar);

    }

    public static void carpimYazdir(int[][] sayilar) {

        int carpim=1;

        for (int i = 0; i < sayilar.length ; i++) {

            for (int j = 0; j < sayilar[i].length ; j++) {

                carpim*=sayilar[i][j];

            }

        }
        System.out.println("carpim = " + carpim);
    }
}
