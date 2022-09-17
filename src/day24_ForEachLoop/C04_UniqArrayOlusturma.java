package day24_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqArrayOlusturma {
    public static void main(String[] args) {
        //Soru 2) Verilen bir array’deki elementleri tek bir defa barındıran array olarak
        // donduren bir method olusturun

        int arr[]={2,3,5,6,3,5,4,1,9,6,3,5,5};
        int uniq[]= uniqArrayOlustur(arr);


        System.out.println(Arrays.toString(uniq));

    }

    public static int[] uniqArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> benzersizList=new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i]!=arr[i+1] && !benzersizList.contains(arr[i])){

                benzersizList.add(arr[i]);

            }
        }

        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }
        int tekrarsızArr[]=new int[benzersizList.size()];

        for (int i = 0; i < tekrarsızArr.length ; i++) {
            tekrarsızArr[i]=benzersizList.get(i);
        }

        return tekrarsızArr;
    }
}
