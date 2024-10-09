package fr.diginamic.jdr;

import java.util.Scanner;

public class Jeu {

    private Personnage personnage;
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean quitter = false;
        while (!quitter) {
            afficherMenu();
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    creerPersonnage();
                    break;
                case 2:
                    if (personnage != null && personnage.getPdv() > 0) {
                        combattreCreature();
                    } else {
                        System.out.println("Votre personnage est décédé. Créer un nouveau.");
                    }
                    break;
                case 3:
                    if (personnage != null) {
                        System.out.println("Score actuel: " + personnage.getScore());
                    } else {
                        System.out.println("Aucun personnage n'a été créé.");
                    }
                    break;
                case 4:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    private void afficherMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Créer un personnage");
        System.out.println("2. Combattre une créature");
        System.out.println("3. Afficher le score");
        System.out.println("4. Sortir");
    }

    private void creerPersonnage() {
        personnage = new Personnage();
        System.out.println("Personnage créé : ");
        personnage.afficherStats();
    }

    private void combattreCreature() {
        Creature creature = choisirCreature();
        Combat combat = new Combat(personnage, creature);
        combat.baston();
    }

    private Creature choisirCreature() {
        System.out.println("Choisissez une créature : 1. Loup, 2. Gobelin, 3. Troll");
        int choix = scanner.nextInt();
        switch (choix) {
            case 1:
                return new Loup();
            case 2:
                return new Goblin();
            case 3:
                return new Troll();
            default:
                System.out.println("Choix invalide, un Loup va être généré par défaut.");
                return new Loup();
        }
    }
}
