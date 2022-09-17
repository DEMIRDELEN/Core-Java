package day41_AbstractClass_Interface;

import java.util.ArrayList;
import java.util.List;

public class GCorolla extends EToyota{
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }
    /*
    COROLLA class ının iki tane parent ı var
    corolla parentlarının ikisinin de standartlarına (abstract methodlarına) uymak zorundadır.

    concrete bir class parent ı olan tum abstract classlarda abstract olan methodları implement etmek zorundadır.
    ancak parent silsilesinde override edilerek concrete yapılan methodları override etmek zorunda değildir.
     */

}
