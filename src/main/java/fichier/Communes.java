package fichier;

public class Villes {
    private String nom;
    private String codeDepartement;
    private String nomRegion;
    private int populationTotale;

    public Villes(String nom, String codeDepartement, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDepartement = codeDepartement;
        this.nomRegion = nomRegion;
        this.populationTotale = populationTotale;
    }

    public String getNom() {
        return nom;
    }
    public String getCodeDepartement() {
        return codeDepartement;
    }
    public String getNomRegion() {
        return nomRegion;
    }
    public int getPopulationTotale() {
        return populationTotale;
    }
}
