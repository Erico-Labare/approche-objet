package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne1 = new CalculMoyenne();
        moyenne1.ajout(10);
        moyenne1.ajout(20);
        moyenne1.ajout(30);
        System.out.println(moyenne1.moyenne());

        CalculMoyenne moyenne2 = new CalculMoyenne();
        moyenne2.ajout(15.5);
        moyenne2.ajout(7.2);
        moyenne2.ajout(12.3);
        moyenne2.ajout(18.7);
        System.out.println("\n"+moyenne2.moyenne());

    }

}
