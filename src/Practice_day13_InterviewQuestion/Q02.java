package Practice_day13_InterviewQuestion;

public class Q02 {
 /*
// Stringi ters cevirmek icin bir Java Programi yazin
//1.Yol: StringBuilder () kullanarak
//2.Yol: String Classini kullanarak
//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
  */

    public static void main(String[] args) {
//1.Yol: StringBuilder () kullanarak
        StringBuilder str = new StringBuilder("input");
        System.out.println(str.reverse());

        String tersinput= str.reverse().toString();
        System.out.println(tersinput);
        //2.Yol: String Classini kullanarak

        for (int i = tersinput.length()-1; i >=0 ; i--) {
            System.out.print(tersinput.charAt(i));
        }

        System.out.println();

        for (int i = tersinput.length()-1; i >=0 ; i--) {
            System.out.print(tersinput.substring(i,i+1));
        }

    }
}