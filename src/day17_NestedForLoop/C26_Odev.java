package day17_NestedForLoop;

public class C26_Odev {


    public static void main(String[] args) {
        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        Input :
        String str=“Javaisalsoeasy”
        Output: a s
        */
        String str = "Javaisalsoeasy";
        System.out.println(tekrarlananHarf(str));

    }

    public static String tekrarlananHarf(String str) {
        String harfler = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))) {
                if (!harfler.contains(str.substring(i, i + 1))) {
                    harfler += str.substring(i, i + 1) + " ";
                }
            }
        }
        return harfler;
    }

}

