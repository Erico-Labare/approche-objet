package list;

public class Ville implements Comparable<Ville> {

    private String nom;
    private int nbHabitant;

    public Ville(String nom, int nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville autre = (Ville) object;
        return nbHabitant == autre.nbHabitant && nom.equals(autre.nom);
    }


    @Override
//    public int compareTo(Ville autre) {
//        return this.nom.compareTo(autre.getNom());
//    }
    public int compareTo(Ville autre) {
        if (this.nbHabitant > autre.nbHabitant) {
            return 1;
        } else if (this.nbHabitant < autre.nbHabitant) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return nom;
    }


    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitant(int nbHabitant) {
        this.nbHabitant = nbHabitant;
    }
}
