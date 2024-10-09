package fr.diginamic.jdr;

public class Goblin extends Creature {
    public Goblin() {
        super(5, 10, 10, 15);
    }


    @Override
    public int getScoreRecompense() {
        return 5;
    }
}
