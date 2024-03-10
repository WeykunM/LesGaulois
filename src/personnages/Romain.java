package personnages;

public class Romain {
	private String nom;
	private int force;
	private int ForceDebut = force;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0 : this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 :"la force d’un Romain n'est pas positive";
		
		force -= forceCoup;

		assert force < ForceDebut:"la force d’un Romain n'a pas diminué";
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}

	public static void main(String[] args) {
		Romain romain = new Romain("Maximus", 6);

		romain.parler("Bonjour, comment ça va?");

		romain.recevoirCoup(8);
	}
}
