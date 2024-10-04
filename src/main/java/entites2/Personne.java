package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    AdressePostale adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public void affichernp() {
        System.out.print(prenom + " " + nom.toUpperCase());
    }

    public void nomModif(String nom) {
        this.nom = nom;
    }

    public void prenomModif(String prenom) {
        this.prenom = prenom;
    }

    public void adresseModif(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String nomReturn() {
        return nom;
    }
    public String prenomReturn() {
        return prenom;
    }
    public AdressePostale adresseReturn() {
        return adresse;
    }


}
