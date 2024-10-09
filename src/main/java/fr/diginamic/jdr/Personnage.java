package fr.diginamic.jdr;

import java.util.Random;

public class Personnage {

    private int force;
    private int pdv;
    private int score;


    public Personnage() {
        Random random = new Random();
        this.force = 12 + random.nextInt(7);
        this.pdv = 20 + random.nextInt(31);
        this.score = 0;

    }

    public int getForce() {
        return force;
    }

    public int getPdv() {
        return pdv;
    }

    public int getScore() {
        return score;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPdv(int pdv) {
        this.pdv = pdv;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void afficherStats() {
        System.out.println("Personnage => Force: " + force + ", Points de vie: " + pdv + ", Score: " + score);
    }

}
