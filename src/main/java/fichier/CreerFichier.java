package fichier;

import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws Exception {
        Path pathOrigine = Paths.get(/*!!!RAJOUTER PATH!!!*/"/approche-objet/recensement.csv");
        Path pathCible = Paths.get(/*!!!RAJOUTER PATH!!!*/"/approche-objet/recensement2.csv");
        List<String> lignesEntree = Files.readAllLines(pathOrigine);
        System.out.println(lignesEntree.size());
        List<String> lignesSortie = new ArrayList<>();
        for (int i = 0; i < (lignesEntree.size() / 2); i++) {
            lignesSortie.add(lignesEntree.get(i));
        }
        Files.write(pathCible,lignesSortie);
        System.out.println(lignesSortie.size());
    }
}
