package day12_StringManipulation;

public class C06_Odev {
    public static void main(String[] args) {

        String STR1= "$13.99";
        String str2= "$10.55";

        STR1= STR1.replace("$","");
        str2= str2.replace("$","");

       double ılk= Double.parseDouble(STR1);
       double ıkı= Double.parseDouble(str2);
        System.out.println(ılk+ıkı);
    }
}
