package day23_ArrayLists;

import java.util.Arrays;

public class C21_Odev {
    public static void main(String[] args) {
        /*
        10- Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
Test Data:
sentence -> "Java is fun"
reversed **-> "**fun is Java**"**

         */
        String cumle = "java is fun";

        String array1[]=cumle.split(" ");

        for (int i = array1.length-1; i >=0 ; i--) {
            System.out.print(" ");
            for (int j = array1[i].length()-1; j >=0 ; j--) {
                System.out.print(array1[i].substring(j,j+1));
            }
        }
    }
}
