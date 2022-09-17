package day12_StringManipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str="1bu2gu3n ja*va- cok g3uz/el";

        //replaceAll aynı özellikteki tüm karakterleri kapsar
        //bütün sayıları sil
        // bütün özel karakterleri sil gibi
        str=str.replaceAll(" ","saa");
        str= str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        str=str.replaceAll("saa"," ");


        System.out.println(str);
    }
}
