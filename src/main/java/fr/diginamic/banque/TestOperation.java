package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[8];

        operations[0] = new Credit("07/10/2024", 1001.0);
        operations[1] = new Credit("08/10/2024", 1002.0);
        operations[2] = new Credit("09/10/2024", 1003.0);
        operations[3] = new Credit("10/10/2024", 1004.0);
        operations[4] = new Debit("07/10/2024", 0101.0);
        operations[5] = new Debit("08/10/2024", 0102.0);
        operations[6] = new Debit("09/10/2024", 0103.0);
        operations[7] = new Debit("10/10/2024", 0104.0);

        double montantGlobal = 0;

        for (int i = 0; i <operations.length; i++){
            System.out.println(operations[i].getType() + " " + operations[i].getDate() + " " + operations[i].getMontant());
            if (operations[i].getType().equals("Credit")) {
                montantGlobal += operations[i].getMontant();
            } else if (operations[i].getType().equals("Debit")) {
                montantGlobal -= operations[i].getMontant();
            }
        }
        System.out.println("\nMontant Global : " + montantGlobal);
    }
}