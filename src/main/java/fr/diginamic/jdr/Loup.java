package fr.diginamic.jdr;

public class Loup extends Creature {
    public Loup() {
        super(3, 8, 5, 10);
    }

    @Override
    public int getScoreRecompense() {
        return 1;
    }
}
