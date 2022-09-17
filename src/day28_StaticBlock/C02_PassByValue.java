package day28_StaticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisfiyati=100;

        System.out.println(indirimliFiyat(satisfiyati)); // 90
        System.out.println(satisfiyati);

        System.out.println(indirimliFiyat(satisfiyati));

        /*
        iki farklı method da satis fiyati isminde variable olabilir, java buna itiraz etmez cunku scope ları farklidir

         */

    }

    public static double indirimliFiyat(double orjinalFiyat){

        //yüzde 10 indirim yapip maine dondurme

        double satisFiyati=orjinalFiyat*0.9;

        return satisFiyati;
    }
}
