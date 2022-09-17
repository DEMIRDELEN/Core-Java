package day42_Abstraction_Interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI=30;

    /*
    ınterface bir class değildir.

    abstract class lar javada abstraction (soyutlastırma/kural koyma) islevini yapıyordu. Ancak abstract bir class da abstract olmayan methodlar da olabilir.
    bu da full abstraction yapmaya izin vermez.

    eger javada icinde hic concrete method olmasın dedigimiz bir class olusturmak istiyorsanız bunu class degil ınterface yapmalısınız.

    1- INTERFACELERDE CONCRETE METHOD OLMAZ...

    2- Interface ler full abstraction yaptıgından ınterfacelerden obje olusturulamaz.

        hatırladıgınız gibi Interface olan List den direk obje olusturamıyorduk.
            List<String> liste = new ArrayList<>();
        Bunun yerine constructor ı list in child ı olan arrayListten seceriz.

    3- classlarda bir child birden fazla parent edinemez. Ancak ınterfacelerde concrete method olmadıgından
       biz her methodu child class da override etmek zorundayız. Override ederken kimin söyledigini override ettigimizin onemi yoktur.

    4- İnterfaceler neyin yapılması gerektigini soyler ama nasıl yapılacagına karısmaz.
     */


}
