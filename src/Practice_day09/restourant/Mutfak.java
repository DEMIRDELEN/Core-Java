package Practice_day09.restourant;

public class Mutfak {

    public String yemekler = "adanakebab, urfaciger, kusbasi, kusleme";
    public String araSıcak = "yaylacorba, mercimek, duguncorba, corba";
    public String tatli = "baklava, sutlac, gullac, kazandibi, kunefe";
    public String icecekler = "ayran, kola, salgam, su";

    Mutfak() {

    }

    public Mutfak(String adanakebab, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebab;
        this.araSıcak=mercimek;
        this.tatli=kunefe;
        this.icecekler=salgam;
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\naraSıcak='" + araSıcak + '\'' +
                "\ntatli='" + tatli + '\'' +
                "\nicecekler='" + icecekler + '\'' +
                '}';
    }
}
