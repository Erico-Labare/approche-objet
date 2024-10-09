package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison1 = new Maison();

        maison1.ajouterPiece(new Chambre(17, 2));
        maison1.ajouterPiece(new Chambre(14, 1));
        maison1.ajouterPiece(new Cuisine(20, 0));
        maison1.ajouterPiece(new SalleDeBain(7,0));
        maison1.ajouterPiece(new WC(3,0));
        maison1.ajouterPiece(new WC(3,1));
        maison1.ajouterPiece(new WC(3,2));

        System.out.println(maison1.superficieTotale());
        System.out.println(maison1.supercieEtage(0));
        System.out.println(maison1.supercieEtage(1));
        System.out.println(maison1.supercieEtage(2));


        maison1.ajouterPiece(null);

        maison1.ajouterPiece(new Chambre(-12, 0));
        maison1.ajouterPiece(new Salon(50, -1));

        System.out.println(maison1.superficieType(WC.class));
        System.out.println(maison1.nombreDUnTypeDePiece(WC.class));


    }
}
