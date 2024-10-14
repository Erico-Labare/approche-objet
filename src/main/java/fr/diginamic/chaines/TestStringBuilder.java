package fr.diginamic.chaines;

public class TestStringBuilder {
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        StringBuilder nombre1A100k = new StringBuilder();
        for (int i = 0; i <= 100000; i++) {
            nombre1A100k.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé pour StringBuilder en millisecondes :" + (fin - debut));

        long debut2 = System.currentTimeMillis();
        String string = "";
        for (int i = 1; i <= 100_000; i++) {
            string += i;
        }
        long fin2 = System.currentTimeMillis();
        System.out.println("Temps écoulé pour String en millisecondes : " + (fin2 - debut2));
    }
}
