package list;

import java.util.ArrayList;

public class TestVilles {

    public static void main(String[] args) {
        ArrayList<Ville> listeVilles = new ArrayList<>();
        listeVilles.add(new Ville("Nice", 343000));
        listeVilles.add(new Ville("Carcassonne", 47800));
        listeVilles.add(new Ville("Narbonne", 53400));
        listeVilles.add(new Ville("Lyon", 484000));
        listeVilles.add(new Ville("Foix", 9700));
        listeVilles.add(new Ville("Pau", 77200));
        listeVilles.add(new Ville("Marseille", 850700));
        listeVilles.add(new Ville("Tarbes", 40600));

        System.out.print("Liste des villes : ");
        for (Ville ville : listeVilles) {
            System.out.print(ville.getNom() + " ");
        }

        Ville lePlusDHab = listeVilles.getFirst();
        for (Ville temp : listeVilles) {
            if (temp.getNbHabitant() > lePlusDHab.getNbHabitant()) {
                lePlusDHab = temp;
            }
        }
        System.out.println("\nLa ville la plus peuplée de la liste est : " + lePlusDHab.getNom());


        Ville leMoinsDHab = listeVilles.getFirst();
        for (Ville temp : listeVilles) {
            if (temp.getNbHabitant() < leMoinsDHab.getNbHabitant()) {
                leMoinsDHab = temp;
            }
        }
        System.out.println("La ville la plus peuplée de la liste est : " + leMoinsDHab.getNom());
        System.out.println("Bye bye " + leMoinsDHab.getNom() + " !");
        listeVilles.remove(leMoinsDHab);

        System.out.print("Liste des villes : ");
        for (Ville ville : listeVilles) {
            System.out.print(ville.getNom() + " ");
        }
    }
}
