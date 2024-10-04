package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {
        Personne pers1 = new Personne();
        pers1.nom = "Jean";
        pers1.prenom = "Dupond";
        pers1.adresse.numeroRue = 6;
        pers1.adresse.libelleRue= "rue du Chat";
        pers1.adresse.codePostal= 34650;
        pers1.adresse.ville = "LaVille";

        Personne pers2 = new Personne();
        pers2.nom = "Marc";
        pers2.prenom = "Dupont";
        pers2.adresse.numeroRue = 7;
        pers2.adresse.libelleRue= "rue du Chien";
        pers2.adresse.codePostal= 46570;
        pers2.adresse.ville = "LeVillage";
    }
}
