package maps;

import list.Ville;

import java.util.HashMap;
import java.util.Map;


public class MapVilles {

    public static void main(String[] args) {
        Map<String, Ville> villeMap = new HashMap<>();

        villeMap.put("Nice", new Ville("Nice", 343000));
        villeMap.put("Carcasonne", new Ville("Carcassonne", 47800));
        villeMap.put("Narbonne", new Ville("Narbonne", 53400));
        villeMap.put("Lyon", new Ville("Lyon", 484000));
        villeMap.put("Foix", new Ville("Foix", 9700));
        villeMap.put("Pau", new Ville("Pau", 77200));
        villeMap.put("Marseille", new Ville("Marseille", 850700));
        villeMap.put("Tarbes", new Ville("Tarbes", 40600));

        for (Ville ville : villeMap.values()) {
            System.out.println(ville);
        }

        String villeMoinsPeuplee = null;
        int populationMin = Integer.MAX_VALUE;

        for (Map.Entry<String, Ville> ville : villeMap.entrySet()) {
            if (ville.getValue().getNbHabitant() < populationMin) {
                populationMin = ville.getValue().getNbHabitant();
                villeMoinsPeuplee = ville.getKey();
            }
        }
        if (villeMoinsPeuplee != null) {
            villeMap.remove(villeMoinsPeuplee);
            System.out.println("\nLa ville la moins peuplée est " + villeMoinsPeuplee + " !\n");

            System.out.println("Villes sans "+ villeMoinsPeuplee +":");
            for (Ville ville : villeMap.values()) {
                System.out.println(ville);
            }
        }
    }
}

