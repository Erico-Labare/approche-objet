package list;

import java.util.ArrayList;

public class CreationList {

    public static void main(String[] args) {

        ArrayList<Integer> nombres = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            nombres.add(i);
        }
        System.out.println("Taille de la liste : "+nombres.size());

    }
}