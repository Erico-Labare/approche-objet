package fr.diginamic.automates;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestJeuDeLaVie {
    public static void main(String[] args) throws IOException {

// - AVANT MISE EN PLACE DU MENU DE CONFIGURATION
//        //Dimensions de la grille
//        int x = 15;
//        int y = 15;
//        int nombreGeneration = 10;
//
//        //Initialisation grille vide
//        boolean[][] blank = {
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//
//        };
//
//        boolean[][] oscilation = {
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, true, true, true, false},
//                {false, false, false, true, true, true, true, false, false, false, false, false, false, false, false},
//                {false, false, false, true, false, false, true, false, false, false, false, false, false, false, false},
//                {false, true, true, true, false, false, true, true, true, false, false, false, false, false, false},
//                {false, true, false, false, false, false, false, false, true, false, false, false, false, false, false},
//                {false, true, false, false, false, false, false, false, true, false, false, false, false, false, false},
//                {false, true, true, true, false, false, true, true, true, false, false, false, false, false, false},
//                {false, false, false, true, false, false, true, false, false, false, false, false, false, false, false},
//                {false, false, false, true, true, true, true, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//
//        };
//
//        boolean[][] vaisseau = {
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, true, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, true, false, false, false, false, false, false, false, false, false, false, false},
//                {false, true, true, true, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//                {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false},
//
//        };


        //Listing fichiers de config par lecture du dossier désigné
        File dossier = new File("fichiers_config_JDLV");
        File[] fichiers = dossier.listFiles();
        List<File> fichiersTxt = new ArrayList<>();
        if (fichiers != null) {
            for (File fichier : fichiers) {
                if (fichier.isFile() && fichier.getName().endsWith(".txt")) {
                    fichiersTxt.add(fichier);
                }
            }
        }
        if (fichiersTxt.isEmpty()) {
            System.out.println("Pas de fichier de configuration trouvé");
            return;
        }


        //Affichage menu fichiers et choix
        System.out.println("Type de configurations :");
        for (int i = 0; i < fichiersTxt.size(); i++) {
            System.out.println((i + 1) + " - " + fichiersTxt.get(i).getName());
        }
        System.out.print("Tapez le numéro de la configuration que vous voulez choisir => ");
        Scanner scannerConfig = new Scanner(System.in);
        int choixConfig = scannerConfig.nextInt();
        scannerConfig.nextLine();
        if (choixConfig < 1 || choixConfig > fichiersTxt.size()) {
            System.out.println("Choix invalide");
        }

        System.out.print("Tapez le nombre de génération que vous voulez (mininum 5 conseillé) => ");
        Scanner scannerGen = new Scanner(System.in);
        int choixGen = scannerGen.nextInt();
        scannerGen.nextLine();
        if (choixGen < 1) {
            System.out.println("Choix invalide");
        }


        //Lecture grille
        File fichierChoisi = fichiersTxt.get(choixConfig - 1);
        boolean[][] grilleInitiale = lectureGrille(fichierChoisi.getPath());
        if (grilleInitiale == null) {
            System.out.println("Erreur lors de la lecture du fichier.");
            return;
        }


        // Initialiser le jeu avec la grille lue
        JeuDeLaVie jeu = new JeuDeLaVie(grilleInitiale.length, grilleInitiale[0].length);
        jeu.initialisationGrille(grilleInitiale);

        // Afficher la grille initiale
        System.out.println("Grille initiale :");
        jeu.affichage();

        // Faire avancer le jeu sur les générations
        for (int i = 0; i < choixGen; i++) {
            jeu.generation();
            System.out.println("Génération " + (i + 1) + ":");
            jeu.affichage();
        }
    }

    // Fonction pour lire la grille depuis un fichier
    public static boolean[][] lectureGrille(String cheminFichier) throws IOException {
        List<String> lignes = Files.readAllLines(Paths.get(cheminFichier));

        int x = lignes.size();
        int y = lignes.get(0).split(" ").length;

        boolean[][] grille = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            String[] cellules = lignes.get(i).split(" ");
            for (int j = 0; j < y; j++) {
                grille[i][j] = cellules[j].equals(".");
            }
        }
        return grille;
    }

// - AVANT MISE EN PLACE DU MENU DE CONFIGURATION
//        JeuDeLaVie jeu1 = new JeuDeLaVie(x, y);
//
//        //Affichage grille depart
//        jeu1.initialisationGrille(grilleInitial);
//        jeu1.affichage();
//
//
//        //Afficher plusieurs generations
//        for (int i = 0; i < nombreGeneration; i++) {
//            jeu1.generation();
//            System.out.println("---------------------------------------------");
//            jeu1.affichage();
//        }
//
//        //Interface utilisateur

}
