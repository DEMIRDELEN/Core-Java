package day33_Encapsulation;

public class Ogretmen_Runner {
    public static void main(String[] args) {

        ogretmen ogr1 = new ogretmen();

        ogr1.setIsim("tulay");
        System.out.println(ogr1.getIsim());

        /*
        bu yontemde data hiding amaclı degil daha anlaşılır bir kod amaclanmıs olur
         */
    }
}
