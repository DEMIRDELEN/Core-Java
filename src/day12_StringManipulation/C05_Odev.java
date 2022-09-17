package day12_StringManipulation;

public class C05_Odev {
    public static void main(String[] args) {

        String str= " java ogrenmek123 Cok guzel@ ";



        str=str.replaceAll(" ","xx");
        str= str.replace("@", ".");
        str= str.replaceAll("\\d","");
        str=str.replaceAll("xx"," ");
        str=str.trim();
        System.out.println(str);
    }
}
