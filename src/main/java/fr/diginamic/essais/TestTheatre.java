package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre1 = new Theatre("Grand Theatre", 100);

        theatre1.inscrire(50, 50);
        System.out.println(theatre1.getInscrits());
        System.out.println(theatre1.getRecette() + '€');

        theatre1.inscrire(50, 50);
        System.out.println(theatre1.getInscrits());
        System.out.println(theatre1.getRecette() + '€');

        theatre1.inscrire(50, 50);
        System.out.println(theatre1.getInscrits());
        System.out.println(theatre1.getRecette() + '€');
    }

}
