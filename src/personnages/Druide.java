package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	int forcePotion = 1;
	private int effetPotionMin;
	private int effetPotionMax;

	Random random = new Random();

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	
 
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void preparerPotion() {
		forcePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;

		parler("Je vais aller pr�parer une petite potion...");

		if (forcePotion > 7) {
			parler("J'ai pr�par� une super potion de force " + forcePotion);
		} else {
			parler("Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
		}
	}
	
	   public void booster(Gaulois gaulois) {
	        if (gaulois.getNom().equals("Ob�lix")) {
	            parler("Non, Ob�lix !... Tu n'auras pas de potion magique !");
	        } else {
	            gaulois.boirePotion(forcePotion);
	        }
	    }
	    


    public static void main(String[] args) {
        Druide panoramix = new Druide("Panoramix", 5, 10);
        panoramix.preparerPotion();
        
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 10);

        System.out.println("\nBooster Asterix:");
        panoramix.booster(asterix);

        System.out.println("\nBooster Obelix:");
        panoramix.booster(obelix);
    }
}