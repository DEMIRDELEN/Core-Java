package day31_TimeFormatter_varargs;

public class C04_VarargsEnUzunKelimeyiYazdırma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("ali","ayse","ısmail","ahmet");
    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enuzunkelime=kelime[0];

        for (String each:kelime
             ) {

            if (each.length()>enuzunkelime.length()){
                enuzunkelime=each;
            }

        }
        System.out.println("enuzunkelime = " + enuzunkelime);
    }
}
