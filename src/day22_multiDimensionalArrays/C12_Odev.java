package day22_multiDimensionalArrays;

public class C12_Odev {
    public static void main(String[] args) {

        //ic array lerin son elemanlarının carpimini yazdiran program

        int sayilar[][] = {{1, 2, 3}, {4, 5}, {6}};

        int carpim = 1;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                if (j == sayilar[i].length - 1) {
                    carpim *= sayilar[i][j];
                }

            }

        }
        System.out.println(carpim);
    }
}
