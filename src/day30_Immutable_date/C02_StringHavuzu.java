package day30_Immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1 = "ali can";
        String str2 = str1 + "";
        String str3 = new String("ali can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1 == str3);

        System.out.println(str2.equals(str4));
        System.out.println(str2 == str4);

        /*
        yeni bir string olustururken
        1-esitligin saginda new keywordu olursa java direk yeni bir obje ve referansını olusturur.
        2- eger esitligin sagında bir method calisiyor veya artı islemi yapılıyorsa string immutable oldugundan degisikligi kaydetmek
            üzere hemen bir kopya string ve referansı olusturur, sonra degeri hesaplayıp bu yeni kopya objenin icine koyar


         */

        String str5 = "ali can";
        String str6 = str1;

        /*
        eger yeni string objesi olusturulurken new kelimesi kullanılmaz veya esitligin sagında bir + islem olmazsa java bakar

        eger daha once olusturulan string objelerden (String havuzu) bire bir aynı string varsa o objeyi ve referansını kullanır
        bire bir aynısı yoksa yeni bir obje olusturur
         */

        System.out.println(str1.equals(str5));
        System.out.println(str5 == str1);
        System.out.println(str1.equals(str6));
        System.out.println(str1 == str6);
        System.out.println(str5 == str6);

        System.out.println(str1==str4);

    }
}
