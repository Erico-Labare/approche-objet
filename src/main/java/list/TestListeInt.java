package list;

import java.util.ArrayList;

public class TestListeInt {

    public static void main(String[] args) {


        ArrayList<Integer> listeEntier = new ArrayList<>();
        listeEntier.add(-1);
        listeEntier.add(5);
        listeEntier.add(7);
        listeEntier.add(3);
        listeEntier.add(-2);
        listeEntier.add(4);
        listeEntier.add(8);
        listeEntier.add(5);

        System.out.println(listeEntier);

        System.out.println(listeEntier.size());

        int max = listeEntier.get(0);
        //int max = Integer.MIN_VALUE
        for (Integer temp : listeEntier) {
            if (temp > max) {
                max = temp;
            }
        }
        System.out.println(max);

        int min = listeEntier.get(0);
        //int min = Integer.MAX_VALUE
        for (Integer temp : listeEntier) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
        listeEntier.remove(Integer.valueOf(min));
        System.out.println(listeEntier);

        for (int i = 0; i < listeEntier.size(); i++) {
            if (listeEntier.get(i)<0){
                listeEntier.set(i, -listeEntier.get(i));
            }
        }
        System.out.println(listeEntier);
    }
}
