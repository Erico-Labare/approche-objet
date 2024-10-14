package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mapSalaires = new HashMap<>();

        mapSalaires.put("Paul", 1750);
        mapSalaires.put("Hicham", 1825);
        mapSalaires.put("Yu", 2250);
        mapSalaires.put("Ingrid", 2015);
        mapSalaires.put("Chantal", 2418);

        System.out.println(mapSalaires);

        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(59, "Lille");
        mapVilles.put(69, "Lyon");
        mapVilles.put(33, "Bordeaux");

        System.out.print("\n");
        for (Integer key: mapVilles.keySet()){
            System.out.print(key+" " );
        }
        System.out.print("\n");
        for (String value: mapVilles.values()){
            System.out.print(value+" " );
        }
        System.out.print("\n");
        System.out.print(mapVilles.size());

    }
}
