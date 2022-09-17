package day22_multiDimensionalArrays;

public class C13_Odev {
    public static void main(String[] args) {

        //ic arraylerdeki aynı indekse sahip degerlerin toplamını yazdıran program

        int arr1[][] = {{1, 2, 3}, {4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        int toplam=0;

        for (int i = 0; i < arr1.length ; i++) {

            for (int j = 0; j <arr1[i].length ; j++) {

                toplam=arr1[i][j]+arr2[i][j];
                System.out.println(toplam+" ");
                toplam=0;
            }

        }


    }
}
