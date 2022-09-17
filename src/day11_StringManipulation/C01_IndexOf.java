package day11_StringManipulation;

public class C01_IndexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok eyi";

        System.out.println(str.indexOf("g"));
        System.out.println(str.indexOf("r"));
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("mek"));
        System.out.println(str.indexOf("e",9));

        int ilke =str.indexOf("e");
        int ikincie= str.indexOf("e", ilke+1);
        int ucuncue= str.indexOf("e", ikincie+1);
        if (ikincie==-1) {
            System.out.println("verilen str'da ikinci e yok");
        } else {
            System.out.println(str.indexOf("3", ikincie));
        }
    }
}
