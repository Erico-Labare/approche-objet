package fr.diginamic.banque.entites;

public class Compte {
    private String numeroCompte;
    private double solde;

    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }
    public String getNumero() {
        return numeroCompte;
    }

}
