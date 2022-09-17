package day17_NestedForLoop;

import java.util.Scanner;

public class C12_Odev {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Birinci sayıyı giriniz: ");
                int sayi1=scanner.nextInt();
                System.out.println("İkinci sayıyı giriniz: ");
                int sayi2=scanner.nextInt();
                int buyuk=Math.max(sayi1,sayi2);
                int ekok=0;
/*
Döngümüze iki sayıdan büyük olan ile başlıyoruz
eğer sayıların çarpımına kadar hiç ortak kat yoksa
ekok sayılarımızın çarpımına eşit olur bu yüzden
döngümüz i<=sayi1*sayi2'ye kadar sürüyor
*/
                for(int i=buyuk;i<=sayi1*sayi2;i++){
                    if(i%sayi1==0&&i%sayi2==0){
                        ekok=i;
                        break;
                    }
                }
                System.out.println("Ekok: "+ekok); }
        }

