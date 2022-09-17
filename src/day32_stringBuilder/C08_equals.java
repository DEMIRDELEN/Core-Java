package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");
        StringBuilder sb3 = new StringBuilder("jüve");
        String str = "java";
        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.equals(sb1));

        //stringbuilder da equals methodu ancak aynı obje olursa true döner, stringdeki gibi dusunme

        System.out.println(sb1.equals(str));
        System.out.println(sb1.compareTo(sb3));
        System.out.println(sb1.compareTo(sb2));

        //compareto methodu 2 stringbuilder methodu bastan başlayarak harf harf karşılaştırır, ilk farklı olna harfe kadar gider,
        //farklı olan iki harfin asci kodları arasındaki farkı verir.

        //eger hiç farklı harf yoksa sonuc olarak sıfır döndürür.

    }
}
