package Practice_day07;

public class Q02_MDArray {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */

        String para[][] = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};

        double dolar=0;
        double euro=0;

        for (int i = 0; i < para.length; i++) {
            for (int j = 0; j < para[i].length; j++) {
                if (para[i][j].contains("$")) {
                    dolar+=Double.parseDouble(para[i][j].replace("$",""))*3.2;
                } else if (para[i][j].contains("€")) {
                    euro+=Double.parseDouble(para[i][j].replace("€",""))*4.2;

                }else {
                    System.out.println("döviz turu yok");
                }
            }
        }
        System.out.println("euro = " + euro);
        System.out.println("dolar = " + dolar);
    }
}
