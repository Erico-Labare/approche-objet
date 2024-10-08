package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int chaineLength = chaine.length();
        System.out.println(chaineLength);

        int chaineIndex = chaine.indexOf(';');
        System.out.println(chaineIndex);

        String chaineExtait = chaine.substring(0, 6);
        System.out.println(chaineExtait);

        System.out.println("\n" + chaineExtait.toUpperCase());
        System.out.println(chaineExtait.toLowerCase() + "\n");

        String[] splitTableau = chaine.split(";");
        for (String mot : splitTableau) {
            System.out.println(mot);
        }


        String salaireString = splitTableau[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireString);

        Salarie salarie = new Salarie(splitTableau[0], splitTableau[1], salaire);

        System.out.println("\nSalarié n°1 = ");
        System.out.println("Nom : " + salarie.getNom());
        System.out.println("Prénom : " + salarie.getPrenom());
        System.out.println("Salaire : " + salarie.getSalaire());
    }
}
