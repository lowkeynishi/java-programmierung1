import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int bananenGramm;
        double KilopreisInCent;
        double bruttoKillopreisInCent;
        double bruttoKillopreis;
        double MWst;
        double NettoPreis;
        double mwstSatz;

        System.out.println("Kilopreis in Cent:");
        KilopreisInCent = sc.nextInt();

        System.out.println("Wie viele Gramm Bananen?");
        bananenGramm = sc.nextInt();

        System.out.println("MwSt in Prozent?");
        mwstSatz = sc.nextInt();

        bruttoKillopreisInCent = bananenGramm * KilopreisInCent / 1000.0;
        bruttoKillopreis = bruttoKillopreisInCent / 100.0;

        NettoPreis = bruttoKillopreis / (1 + mwstSatz / 100.0);
        MWst = bruttoKillopreis - NettoPreis;

        bruttoKillopreis = Math.round(bruttoKillopreis * 100.0) / 100.0;
        MWst = Math.round(MWst * 100.0) / 100.0;
        NettoPreis = Math.round(NettoPreis * 100.0) / 100.0;

        System.out.println("Brutto: " + bruttoKillopreis + " Euro");
        System.out.println("MWSt: " + MWst + " Euro");
        System.out.println("Netto: " + NettoPreis + " Euro");
    }
}