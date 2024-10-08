package fr.diginamic.salaire;

public class Pigist extends Intervenant {

    private double nombreDeJourTravaille;
    private double salaireJournalier;

    public Pigist(String nom, String prenom, double nombreDeJourTravaille, double salaireJournalier) {
        super(nom, prenom);
        this.nombreDeJourTravaille = nombreDeJourTravaille;
        this.salaireJournalier = salaireJournalier;

    }

    @Override
    public double getSalaire() {
        return salaireJournalier;
    }

    @Override
    public String getStatut() {
        return "Pigiste";
    }
}
