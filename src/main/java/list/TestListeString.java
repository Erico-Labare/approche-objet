package list;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {

    public static void main(String[] args) {

        ArrayList<String> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
        System.out.println(listeVilles);

        String lePlusLong = listeVilles.get(0);
        for (String temp : listeVilles) {
            if (temp.length() > lePlusLong.length()) {
                lePlusLong = temp;
            }
        }
        System.out.println(lePlusLong);

        for (int i = 0; i < listeVilles.size(); i++) {
            listeVilles.set(i, listeVilles.get(i).toUpperCase());
        }
        //listeVilles.replaceAll(String::toUpperCase);
        System.out.println(listeVilles);

        listeVilles.removeIf(temp -> temp.startsWith("N"));
        System.out.println(listeVilles);
    }
}

