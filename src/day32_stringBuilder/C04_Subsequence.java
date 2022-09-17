package day32_stringBuilder;

public class C04_Subsequence {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kayra");
        sb.substring(0,3);
        // bu method string dondurdugu icin string builder ın eski halini degistiremez.
        System.out.println(sb);

        sb.subSequence(0,3);
        System.out.println(sb);
    }
}
