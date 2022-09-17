package day32_stringBuilder;

public class C02_append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java daha ne yapsin");
        sb.append("?");
        System.out.println(sb);
        //append istedigimiz stringi en sona ekler.

        sb.append("java",2,4);

        sb.insert(4," her seyi düsünmüs,");
        System.out.println(sb);
        //araya ekleme yapmak icin insert kullanılır.

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);
    }
}
