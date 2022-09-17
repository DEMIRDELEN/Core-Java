package day17_NestedForLoop;

public class C27_Odev {
    public static void main(String[] args) {

        String str="keleekaaeqrk";

        System.out.println(tekrarKE(str));
    }

    public static String tekrarKE(String str) {

        String tekrarEden = "";

        for (int i = 0; i < str.length(); i++) {

            if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))) {
                if (!tekrarEden.contains(str.substring(i, i + 1))) {
                    tekrarEden += str.substring(i, i + 1)+" ";
                }
            }

        }

        return tekrarEden;

    }
}
