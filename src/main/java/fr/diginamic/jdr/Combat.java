package fr.diginamic.jdr;

import java.util.Random;

public class Combat {
    private Personnage personnage;
    private Creature creature;

    public Combat(Personnage personnage, Creature creature) {
        this.personnage = personnage;
        this.creature = creature;
    }

    public void baston() {
        Random random = new Random();
        System.out.println("Combat : ");
        while (personnage.getPdv() > 0 && creature.getPdv() > 0) {
            int attaquePerso = personnage.getForce() + random.nextInt(10) + 1;
            int attaqueCreature = creature.getForce() + random.nextInt(10) + 1;
            if (attaquePerso > attaqueCreature) {
                int degats = attaquePerso - attaqueCreature;
                creature.setPdv(creature.getPdv() - degats);
                System.out.println("La creature reçoit " + degats + " points de dégâts");
            } else {
                int degats = attaqueCreature - attaquePerso;
                personnage.setPdv(personnage.getPdv() - degats);
                System.out.println("Le personnage reçoit " + degats + " points de dégâts");
            }
        }

        if (personnage.getPdv() <= 0) {
            System.out.println("Votre personnage est mort avec un score de " + personnage.getScore() + " points.");
        } else {
            personnage.setScore(personnage.getScore() + creature.getScoreRecompense());
            System.out.println("Votre personnage a gagné le combat. Nouveau score: " + personnage.getScore());
        }

    }
}
