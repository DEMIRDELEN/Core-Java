package Practice_day07;

public class Q01_MDArray {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int array[][] = {{4, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 0}};

        int enKucuk = array[0][0];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < enKucuk) {
                    enKucuk = array[i][j];
                }
            }
        }
        System.out.println(enKucuk);
    }
}
