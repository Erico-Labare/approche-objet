package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char operateur) {
        switch (operateur) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '/':
                if (b != 0) {
                    return a / b;
                }else {
                    System.out.println("- Division par zero");
                    return 0;
                }

            case '*':
                return a * b;
            default:
                System.out.println("Invalide");
                return 0;

        }
    }
}
