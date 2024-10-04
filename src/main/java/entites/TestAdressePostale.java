package entites;

public class TestAdressePostale {
    public static void main(String args[]) {
        AdressePostale adr1 = new AdressePostale(5, "rue des Maréchaux", 44100, "Nantes");
//        adr1.numeroRue = 5;
//        adr1.libelleRue = "rue des Maréchaux";
//        adr1.codePostal = 44100;
//        adr1.ville = "Nantes";
        System.out.println(adr1.numeroRue);

        AdressePostale adr2 = new AdressePostale(7, "rue de la Rue", 76890, "LaVille");
//        adr2.numeroRue = 7;
//        adr2.libelleRue = "rue de la Rue";
//        adr2.codePostal = 76890;
//        adr2.ville = "LaVille";
        System.out.println(adr2.numeroRue);
//    }
    }
}
