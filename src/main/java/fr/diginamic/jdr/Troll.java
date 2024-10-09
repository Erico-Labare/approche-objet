package fr.diginamic.jdr;

public class Troll extends Creature {
    public Troll() {
        super(10, 15, 20, 50);
    }


    @Override
    public int getScoreRecompense() {
        return 5;
    }
}
