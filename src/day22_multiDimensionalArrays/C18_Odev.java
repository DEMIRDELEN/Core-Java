package day22_multiDimensionalArrays;

public class C18_Odev {
    public static void main(String[] args) {

        //SORU 3=Asağıdaki multi dimensional array'lerin iç arraylerindeki anı indexe sahip
        // elemanların toplamını ekrana yazdıran bir program yazınız
        // arr1={{1,2},{3,4,5},{6}} ve arr2={{7,8,9},{10,11},{12}}


        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        int toplam = 0;
        int toplam2 = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    for (int l = 0; l < arr2[k].length; l++) {

                        if (i == k && j == l) {
                            toplam += arr1[i][j];
                            toplam += arr2[k][l];
                            toplam2+=toplam;
                            System.out.println(i + "." + j + ". indexin toplamı: " + toplam);
                            toplam = 0;
                        }

                    }
                }
            }
        }
        System.out.println("Secilen indexteki sayıların toplamı:" + toplam2);
    }
}

