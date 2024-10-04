package entites;

public class TestAdressePostale {
    public static void main (String args[]){
        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 5;
        adr1.libelleRue = "des Maréchaux";
        adr1.codePostal = 44100;
        adr1.ville = "Nantes";

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 7;
        adr2.libelleRue = "de la Rue";
        adr2.codePostal = 76890;
        adr2.ville = "LaVille";
    }

}
