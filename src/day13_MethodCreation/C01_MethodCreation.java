package day13_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {
        // method call
        // argüment eklenmesi gerekiyorsa ekleyelim
        // eger retrn type voidden farklı ise bir variable oluşturup method coll u assign edelim

       int input1=10;
       int input2=20;

       topla(input2,input1);


    }

    public static void topla(int input2, int input1) {

        //metgod deklorasyona ayar çek(access modifier ya da return type gibi)
        //return type void dışında birşey ise return keyword u ve dönecek değeri hesaplayın

        System.out.println("girilen 2 sayının toplamı: "+ (input1+input2));


    }


}
