package Practice_day02;

public class Q05_ForLoop {
    public static void main(String[] args) {

        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

     //  for (int i = 0; i <=255 ; i++) {

     //      char c=(char) i;

     //      System.out.println(i+"->"+c);

     //  }


      //  int i=0;
//
      //  while (i<=255){
//
      //      char s=(char) i;
      //      System.out.println(i+"->"+s);
      //      i++;
      //  }

        int i=0;

        do {
            char a= (char) i;
            System.out.println(i+"->"+a);
            i++;
        }while (i<=255);
    }
}
