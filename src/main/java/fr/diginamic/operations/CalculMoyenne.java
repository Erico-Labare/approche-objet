package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tableauPourMoyenne = new double[0];


    public void ajout(double valeur) {
        tableauPourMoyenne = Arrays.copyOf(tableauPourMoyenne, tableauPourMoyenne.length + 1);
        tableauPourMoyenne[tableauPourMoyenne.length-1] = valeur;
    }

    public double moyenne() {
        double somme = 0;
        for (int i = 0; i < tableauPourMoyenne.length; i++) {
            somme += tableauPourMoyenne[i];
        }
        return somme / tableauPourMoyenne.length;

    }

}
