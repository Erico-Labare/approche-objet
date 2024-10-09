package fr.diginamic.jdr;

import java.util.Random;

public class Creature {
    private int force;
    private int pdv;


    public Creature(int minForce, int maxForce, int minPv, int maxPv) {
        Random random = new Random();
        this.force = minForce + random.nextInt(maxForce - minForce + 1);
        this.pdv = minPv + random.nextInt(maxPv - minPv + 1);
    }

    public int getForce() {
        return force;
    }
    public int getPdv() {
        return pdv;
    }
    public void setPdv(int pdv) {
        this.pdv = pdv;
    }
    public void setForce(int force) {
        this.force = force;
    }

    public int getScoreRecompense() {
        return 0;
    }
}
