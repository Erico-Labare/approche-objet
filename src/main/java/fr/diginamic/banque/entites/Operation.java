package fr.diginamic.banque.entites;

public abstract class Operation {

    private String dateOperation;
    private double montant;

    public Operation(String dateOperation, double montant) {
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public String getDateOperation() {
        return dateOperation;
    }
    public double getMontant () {
        return montant;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return dateOperation + " : " + montant;
    }
}