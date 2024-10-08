package fr.diginamic.maison;


import java.util.ArrayList;
import java.util.List;

public class Maison {

    private List<Piece> pieces = new ArrayList<>();

    //ajout de pièce
    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            System.out.println("ERREUR ! Une pièce défini est null.");
            return;
        }
        if (piece.getSuperficie() <= 0 || piece.getNumeroEtage() < 0) {
            System.out.println("ERREUR ! Une superficie ou un étage défini est négative.");
            return;
        }
        pieces.add(piece);
    }

    //superficie totale
    public double superficieTotale() {
        double superficieTotale = 0;
        for (Piece piece : pieces) {
            superficieTotale += piece.getSuperficie();
        }
        return superficieTotale;

    }

    //superficie d'un étage
    public double supercieEtage(int etage) {
        double superficieEtage = 0;
        for (Piece piece : pieces) {
            if (piece.getNumeroEtage() == etage) {
                superficieEtage += piece.getSuperficie();
            }
        }
        return superficieEtage;
    }

    //superficie d'un type de pièce
    public double superficieType(Class<?> type) {
        double superficieType = 0;
        for (Piece piece : pieces) {
            if (type.isInstance(piece)) {

                superficieType += piece.getSuperficie();
            }
        }
        return superficieType;
    }

    //nombre d'un type de pièces
    public int nombreDUnTypeDePiece(Class<?> type) {
        int count = 0;
        for (Piece piece : pieces) {
            if (type.isInstance(piece)) {
                count++;

            }
        }
        return count;
    }

}
