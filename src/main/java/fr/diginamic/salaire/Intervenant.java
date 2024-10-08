package fr.diginamic.salaire;

public abstract class Intervenant {

    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }

    public abstract double getSalaire();
    public abstract String getStatut();

    public void afficherDonnee(){
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Salaire : " + getSalaire() + "€");
        System.out.println("Statut : " + getStatut());
    }

}
