package personnages;

public enum Equipement {
    CASQUE("casque"), BOUCLIER("bouclier");

    private String nom;

    private Equipement (String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }


    public String toString() {
        return nom;
    }

    public static void main(String[] args) {
        // Testing the Equipement enum
        System.out.println("Afficher CASQUE: " + Equipement.CASQUE);
        System.out.println("Afficher BOUCLIER: " + Equipement.BOUCLIER);
    }
}