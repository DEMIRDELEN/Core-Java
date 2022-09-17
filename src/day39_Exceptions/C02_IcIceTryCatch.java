package day39_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IcIceTryCatch {
    public static void main(String[] args) {

        int k;
        try {
            FileInputStream fis = new FileInputStream("src/day39_Exceptions/Test.txt");

            while ((k=fis.read()) !=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("dosyadan bilgiler okunamadı");
        }


    }
}
