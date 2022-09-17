package day17_NestedForLoop;

public class C18_Odev {
    public static void main(String[] args) {

        /*

        Bir String icerisinde yinelenen karakterleri
        döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */

        String str = "java cok guzelll";

        str = str.replaceAll("\\W", "");

        str = str.trim();

        String bulunan = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            String x = str.substring(i, i + 1);

            for (int j = i + 1; j <= str.length() - 1; j++) {

                String y = str.substring(j, j + 1);

                if (x.equals(y)) {
                    if (!bulunan.contains(x)) {
                        bulunan += x + " ";
                    }
                }


            }
            System.out.print(bulunan);
        }
    }
}
