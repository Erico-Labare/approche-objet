package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
//import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
//        Compte[] compte1 = new Compte("102923998384848", 28.9);
//        System.out.println(compte1);

        Compte[] comptes = {new Compte("5768690", 39.0), new CompteTaux("9765044", 10000.0, 0.5)};

        for (int i = 0; i <comptes.length; i++){
            System.out.print("\n"+comptes[i]);
        }
//        System.out.print(Arrays.toString(comptes));
    }
}
