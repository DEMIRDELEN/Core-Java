package day41_AbstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {
        /*
        abstract class da main method opsiyoneldir.

        eger abstract class saadece child class ların taşımak zorunda oldugu ozellikleri belirlemek icin olusutulduysa
        main method a ihtiyaç olmaz.
        sadece abstract methodlar olur. ama bir abstract method da standart belirlemek dısında da methodlar calisabilir.
        bu durumda ihtiyaç olursa main method olusturulabilir.

         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();
    public abstract void motor();
    /*
    sadece child classların mecburi taşıyacakları ozellikleri belirleyen methodlar abstract method olur ve abstract methodların body si olmaz.
     */
    public void klima(){
        System.out.println("bazı arabalarda klima olabilir");
    }
    /*
    abstract olmayan methodlara concrete method denir.
    abstract bir methodu abstract keyword u belirtmek zorunludur.
    concrete methodlarda bunun deklare edilmesine gere yoktur
    biz sadece abstraction ile ilgili konuştugumuzda abstract olmayanlara methodlardan bahsetmek icin concrete tabirini kullanırız.
     */

}
