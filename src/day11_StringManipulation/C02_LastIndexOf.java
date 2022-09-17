package day11_StringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";
        int ilk = cumle.indexOf(kelime);
        int iki= cumle.indexOf(kelime,ilk+1);
        int son = cumle.lastIndexOf(kelime);

        if (ilk==-1) {
            System.out.println("bu kelime kullanılmamış");
        } else if (iki==son) {
            System.out.println("bu kelime cümlede sadece bir defa kullanılmış");
        } else {
            System.out.println("kelime cümlede birden fazla kullanılmıştır");
        }
    }
}
