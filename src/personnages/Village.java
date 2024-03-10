package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;
	private int nbVillageoisMaximum;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			System.out.println("Le Gaulois " + gaulois.getNom() + " a rejoint le village.");
		} else {
			System.out.println("Le village est déjà plein, impossible d'ajouter un nouvel habitant.");
		}
	}

	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les légendaires Gaulois:");

		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}

	public Gaulois trouverHabitant(int num) {
		if (num >= 1 && num <= nbVillageois) {
			return villageois[num - 1];
		} else {
			System.out.println("Aucun habitant trouvé pour le numéro " + num);
			return null;
		}
	}

	public static void main(String[] args) {

		Village village = new Village("Village des Irréductibles", 30);

		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);

		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);

		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);

		village.afficherVillageois();
	}
}
