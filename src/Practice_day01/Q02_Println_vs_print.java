package Practice_day01;

public class Q02_Println_vs_print {

    public static void main(String[] args) {

        /*
println() ve print() arasinda tek fark var;
println satir atliyor,
print ise imlecin ayni satirda kalmasini sagliyor.

 */

        System.out.println("helle");
        System.out.println("java");
        System.out.println("helle");

        System.out.println("  ");

        System.out.print("helle");
        System.out.print(" java");
        System.out.print(" helle");
    }
}
