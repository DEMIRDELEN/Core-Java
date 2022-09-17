package day31_TimeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        String ali="ali";
        enUzunKelimeyiYazdir(5,"ali", "ayse", "ısmail", "ahmet", "akin");

        /*
        varargs teorik olarak sonsuz sayida element alabilir bir methodda parametre olarak varargs varsa varargs ın sınırlarını bilebilmesi icin parametrelerin sonuncusu olmalıdır.
        oncesinde farklı parametreler olabilir ancak varargs dan sonra parametre olmaz. bu kuraldan oturu bir methodda sadece bir tane varargs olabilir.
         */
        System.out.println("ali".equals(ali));
    }

    public static void enUzunKelimeyiYazdir( int kelimesayisi, String... kelime) {

        String enuzunkelime = kelime[0];

        for (String each : kelime
        ) {

            if (each.length() > enuzunkelime.length()) {
                enuzunkelime = each;
            }

        }
        System.out.println("enuzunkelime = " + enuzunkelime);
    }
}
