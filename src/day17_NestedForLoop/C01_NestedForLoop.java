package day17_NestedForLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {

        //verilen stringdeki kullanılan harfleri
        //tekrarsız olarak yazdırıp kelimede
        // kullanılan farklı harf sayısını veren bir method yazın

        String input="taka taka";

        tekrarsızYap(input);

    }

    public static void tekrarsızYap(String input) {

        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W", ""); //javaherzamanguzel

        System.out.print(input.substring(0,1));//j

        benzersizInput+=input.substring(0,1);//j

        for (int i = 1; i <islenecekKelime.length(); i++) {

            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }


        }
        System.out.println("");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);

    }

}
