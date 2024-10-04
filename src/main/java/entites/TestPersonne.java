package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {
        AdressePostale adresse1 = new AdressePostale(5, "rue des Maréchaux", 44100, "Nantes");
        Personne pers1 = new Personne("Jean", "Dupond", adresse1);
//        pers1.nom = "Jean";
//        pers1.prenom = "Dupond";
//        pers1.adresse.numeroRue = 6;
//        pers1.adresse.libelleRue = "rue du Chat";
//        pers1.adresse.codePostal = 34650;
//        pers1.adresse.ville = "LaVille";
        System.out.println(pers1.nom);

      AdressePostale adresse2 = new AdressePostale(7, "rue de la Rue", 76890, "LaVille");
        Personne pers2 = new Personne("Marc", "Dupond", adresse2);
//        pers2.nom = "Marc";
//        pers2.prenom = "Dupont";
//        pers2.adresse.numeroRue = 7;
//        pers2.adresse.libelleRue = "rue du Chien";
//        pers2.adresse.codePostal = 46570;
//        pers2.adresse.ville = "LeVillage";
        System.out.println(pers2.nom);
    }
}
