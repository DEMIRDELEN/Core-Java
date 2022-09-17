package day04_DataCasting;

public class C04_ExplicitNarrowing {

    public static void main(String[] args) {

        int sayı1=50;
        short sayı2= (short) sayı1;

        // Genişi dara atarken java değerin uyup uymayacağını bilemez,
        // bu sebeple risk almaz ve burada sıkıntı olursa sorumluluk sende der,
        // önüne parantezle yazarsan sıkıntı yok ( short sayı2= sayı1;)

        System.out.println(sayı2);
    }
}
