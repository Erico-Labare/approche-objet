package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double a = 10;
        double b = 20;

        double resultatPlus = Operations.calcul(a, b, '+');
        System.out.print("\n"+a + " + " + b + " = " + resultatPlus);

        double resultatMoins = Operations.calcul(a, b, '-');
        System.out.print("\n"+a + " - " + b + " = " + resultatMoins);

        double resultatDivision = Operations.calcul(a, b, '/');
        System.out.print("\n"+a + " / " + b + " = " + resultatDivision);

        double resultatMultiplication = Operations.calcul(a, b, '*');
        System.out.print("\n"+a + " * " + b + " = " + resultatMultiplication);

    }
}
