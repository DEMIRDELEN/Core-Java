package Practice_day07;

public class Q03_MDArray {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int input[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};

        System.out.println("ciftleriTopla(input) = " + ciftleriTopla(input));


      // public class Q03_MDArray_ForEach_Return {
      //     /*
      //      * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
      //      * yaziniz
      //      * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
      //      *
      //      * OUTPUT : Arraydeki cift sayilarin toplami : 30
      //      */
      //     public static void main(String[] args) {
      //         int arr[][] = {{1,3,6},{2,8},{5,7,9,14}};
      //         System.out.println("ciftleriTopla(arr) = " + ciftleriTopla(arr));
      //     }
      //     private static int ciftleriTopla(int[][] arr) {
      //         int toplam =0;
      //         for(int [] each1 :arr){ //outer for each
      //             for(int each2 :each1) { //inner for each
      //                 if(each2%2==0){
      //                     toplam += each2;
      //                 }
      //             }
      //         }
      //         return toplam;
      //     }
        }


    public static int ciftleriTopla(int[][] input) {

        int toplam=0;

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                if (input[i][j]%2==0){
                    toplam+=input[i][j];
                }
            }
        }

        return toplam;
    }
}
