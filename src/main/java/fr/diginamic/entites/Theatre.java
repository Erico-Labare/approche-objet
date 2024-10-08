package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int inscrits;
    private double recette;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.inscrits = 0;
        this.recette = 0;
    }



    //sur cette partie, je suis partie du principe que si la capacité max était atteinte pour le théatre, c'éatait bon, mais pas au-dessus
    public void inscrire(int nombreClient, double prixPlace) {
        if (nombreClient + inscrits< capaciteMax) {
            inscrits += nombreClient;
            recette += inscrits * prixPlace;

        } else if (nombreClient + inscrits == capaciteMax){
            inscrits += nombreClient;
            recette += inscrits * prixPlace;
            System.out.println("! Capacité max atteinte !");

        } else {
            System.out.println("!!! ERREUR !!! Capacité max atteinte ! SUPPERFLUX DE " + (nombreClient+inscrits-capaciteMax)+ " CLIENTS !!!");
        }
    }
    public String getNom() {
        return nom;
    }
    public int getCapaciteMax() {
        return capaciteMax;
    }
    public int getInscrits() {
        return inscrits;
    }
    public double getRecette() {
        return recette;
    }
}
