package day24_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String arr[]={"ismail","nurullah","fatih"};
        /*
        uzun listeler olusturmamız gerektiginde, tek tek eklemek yerine array
        olusturup bunları liste cevirmek daha pratik olabilir
        1-loop ile array deki tum elementleri liste atabiliriz
        2- arrays.aslist() kullanabiliriz
            ancak bu methodun 2 kötu yan etkisi var
            - Arrays class ı kullanıldığı icin array özellikleri gecerli olur
            dolayısıyla listte olan add remove gibi size'ı
            degistiren metodlar bu sekilde olusturulan listlerde kullanılamaz
            - akaynak olan array ile urun olan list ozdeslestirilir, birinde
            yapılan degisiklik otomatik olarak digerine de islenir
            */

        List<String> siniflist= Arrays.asList(arr);
        System.out.println(siniflist);

        // 1. yan etli

        // siniflist.add("erdi");

        // siniflist.remove(1);

        // 2. yan etki

        arr[1]="emre";

        System.out.println("degisim sonrası array: "+ Arrays.toString(arr));
        System.out.println("arrayi degistirince List: "+ siniflist);

        siniflist.set(0,"utku");

        System.out.println("listi degistirince list: "+siniflist);
        System.out.println("listi degistirince array: "+Arrays.toString(arr));

    }
}
