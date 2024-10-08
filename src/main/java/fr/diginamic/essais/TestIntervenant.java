package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigist;
import fr.diginamic.salaire.Salarie;

import java.sql.SQLOutput;

public class TestIntervenant {

    public static void main(String[] args) {

        Intervenant salarie1 = new Salarie("Grand", "Jean", 2000);
        //System.out.println("Salaire de " + salarie1.getPrenom() + " " + salarie1.getNom() + " ("+salarie1.getStatut()+")"+" : " + salarie1.getSalaire() + "€/mois");
        salarie1.afficherDonnee();

        System.out.println("\n");

        Intervenant pigiste1 = new Pigist("Petit", "Kevin", 60, 14);
        //System.out.println("Salaire de " + pigiste1.getPrenom() + " " + pigiste1.getNom() + " ("+pigiste1.getStatut()+")"+" : " + pigiste1.getSalaire() + "€/jours");
        pigiste1.afficherDonnee();
    }
}