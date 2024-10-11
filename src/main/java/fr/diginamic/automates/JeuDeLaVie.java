package fr.diginamic.automates;

public class JeuDeLaVie {

    //Mon tableau à 2 entrée
    private boolean[][] grille;
    private int x;
    private int y;

    //Le constructeur
    public JeuDeLaVie(int x, int y) {
        this.grille = new boolean[x][y];
        this.x = x;
        this.y = y;
    }

    //Initialisation de la grille
    public void initialisationGrille(boolean[][] grilleInitialise) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                grille[i][j] = grilleInitialise[i][j];
            }
        }
    }

    //Affichage de la grille
    public void affichage() {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(grille[i][j] ? "[O]" + " " : "[ ]" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    //Methode de generation
    public void generation() {
        boolean[][] grilleNextGen = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int countAdjacent = countAdjacent(i, j);

                if (grille[i][j]) {
                    if (countAdjacent == 2 || countAdjacent == 3) {
                        grilleNextGen[i][j] = true;
                    } else {
                        grilleNextGen[i][j] = false;
                    }
                } else {
                    if (countAdjacent == 3) {
                        grilleNextGen[i][j] = true;
                    }
                }
            }

        }
        grille = grilleNextGen;
    }

    //Methode de comtage de cellules adjacents
    public int countAdjacent(int iSurX, int jSurY) {
        int countAdjacent = 0;
        for (int iLocal = -1; iLocal <= 1; iLocal++) {
            for (int jLocal = -1; jLocal <= 1; jLocal++) {
                if (iLocal == 0 && jLocal == 0) {
                    continue;
                }

                int adjacentX = iLocal + iSurX;
                int adjacentY = jLocal + jSurY;
                if (adjacentX >= 0 && adjacentY >= 0 && adjacentX < x && adjacentY < y) {
                    if (grille[adjacentX][adjacentY]) {
                        countAdjacent++;
                    }

                }
            }
        }
        return countAdjacent;
    }

}
