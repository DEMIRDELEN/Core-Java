package day37_Overriding;

public class FSupra extends EToyota{

    protected void yakit(){
        System.out.println("sıpra sadece benzin kullanır.");
    }
    /*
    Private methodlar override edilemez.
    Eğer child class da parent class daki private method ile aynı signature da bir method olusturursanız bu overriding method olmaz.
     */
    protected void motor() {
        System.out.println("supra sırali 6 silindir 2JZ motor kullanır.");
    }
    /*
    override notasyonu javaya bir görev verir.

    java bu notason ile birbirine bağlı olan iki methodu surekli kontrol eder. Eger parent class daki overriden methodu silerseniz
    CTE verir.

    @override notasyonu kullanmak mecburi değildir.
    Eger overriden edilmiş method silinirsi ve codun CTE vermesini istersek @override notasyonu vermeliyiz.
     */

}
