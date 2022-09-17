package day40_Final;

public abstract class CAbstract {

    void toplama(){
        System.out.println("bu method toplama yapar");
    }
    abstract void carpma();

    abstract void bolme();

    void cikarma(){
        System.out.println("bu method cikarma yapar");
    }
    /*
    bir method un basina abstract yazarsanız bu method un child class lar icin bir
    standart oldugunu declare etmiş olursunuz ve method buddy sine ihtiyac kalmaz.
     */
}
