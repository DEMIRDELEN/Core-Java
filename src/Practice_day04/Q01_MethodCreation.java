package Practice_day04;

public class Q01_MethodCreation {
    public static void main(String[] args) {

        String input="aabbbbcccdddd";

        birKezYazdir(input);
    }

    public static void birKezYazdir(String input) {

        String tum="";

        for (int i = 0; i <input.length() ; i++) {
            if (!tum.contains(input.substring(i,i+1))){
                tum+=input.substring(i,i+1);
            }
        }
        System.out.println(tum);
    }
}
