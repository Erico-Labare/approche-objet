package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte("102923998384848", 28.9);
        System.out.println(compte1.getNumero()+" "+compte1.getSolde());
    }
}
