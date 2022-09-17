package day07_İfStatements;

public class C11_Ödev {
    public static void main(String[] args) {

        int x=1;
        int y=1;

        if (x++<++y) {
            System.out.println("hello ");
        } else {
            System.out.println("welcome ");
        }
        System.out.println("log = " + x + ":" + y);
    }
}
