package day11_StringManipulation;

public class C07_StartsWith {
    public static void main(String[] args) {

        String input= "java gun gectikce guzellesiyor";
        System.out.println(input.startsWith("j"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gun",5));
    }
}
