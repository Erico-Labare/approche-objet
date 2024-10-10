package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get(/*!!!RAJOUTER PATH!!!*/"/approche-objet/recensement.csv");

        List<String> lignes = Files.readAllLines(path);
//        for(Path temp:path){
//            System.out.println(lignes);
//        }

        List<Communes> communes = new ArrayList<>();

        for (int i = 1; i < lignes.size(); i++) {
            String ligne = lignes.get(i);
            String[] token = ligne.split(";");
//            System.out.println(ligne);

            String nom = token[6];
            String codeDepartement = token[2];
            String nomRegion = token[1];
            int populationTotale = Integer.parseInt(token[9].replaceAll(" ", ""));

            Communes commune = new Communes(nom, codeDepartement, nomRegion, populationTotale);

            communes.add(commune);
        }
//        for (Communes commune : communes){
//            System.out.println(communes.toString());
//        }


        List<String> villesPlusDe25K = new ArrayList<>();
        villesPlusDe25K.add("Nom;Code Département;Nom Région;Population Totale");
        for (Communes ville : communes) {
            if (ville.getPopulationTotale() > 25000) {
                String ligne = ville.getNom() + ";" + ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale();
                villesPlusDe25K.add(ligne);
            }
        }

        //Path pathCible = Paths.get(/*!!!RAJOUTER PATH!!!*/"/approche-objet/recensement25k+.csv");
        //Files.write(pathCible, villesPlusDe25K);


        List<String> departements = new ArrayList<>();
        List<Integer> nombreVilles = new ArrayList<>();

        for (Communes ville : communes) {

            boolean existe = false;

            for (int i = 0; i < departements.size(); i++) {
                if (departements.get(i).equals(ville.getCodeDepartement())) {
                    nombreVilles.set(i, nombreVilles.get(i) + 1);
                    existe = true;
                    break;
                }
            }

            if (!existe) {
                departements.add(ville.getCodeDepartement());
                nombreVilles.add(1);
            }
        }

        for (int i = 0; i < departements.size(); i++) {
            System.out.println("Département " + departements.get(i) + " à " + nombreVilles.get(i) + " villes");
        }

    }
}
