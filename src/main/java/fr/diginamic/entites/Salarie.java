package fr.diginamic.entites;

public class Salarie {

    String nom;
    String prenom;
    double salaire;


    public Salarie(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public double getSalaire() {
        return salaire;
    }

}
