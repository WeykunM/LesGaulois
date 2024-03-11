package personnages;

public class romain2 {


	private String nom;
	private int force;
	private int ForceDebut = force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public romain2(String nom, int force) {
		this.nom = nom;
		assert force > 0 : this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "la force d�un Romain n'est pas positive";

		force -= forceCoup;

		assert force < ForceDebut : "la force d�un Romain n'a pas diminu�";
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
	}

//	public void sEquiper(Equipement equipement) {
//		assert nbEquipement >= 0 && nbEquipement <= 2 : "Le nombre d'�quipements doit �tre entre 0 et 2";
//
//		if (nbEquipement == 0) {
//			equipements[0] = equipement;
//			parler("Le soldat " + nom + " s'�quipe avec un " + equipement);
//			nbEquipement++;
//		} else if (nbEquipement == 1) {
//			if (equipements[0] == equipement) {
//				parler("Le soldat " + nom + " poss�de d�j� un " + equipement);
//			} else {
//				equipements[1] = equipement;
//				parler("Le soldat " + nom + " s'�quipe avec un " + equipement);
//				nbEquipement++;
//			}
//		} else {
//			parler("Le soldat " + nom + " est d�j� bien  prot�g� !");
//		}
//	}
	
	public void sEquiper(Equipement equipement) {
        assert nbEquipement >= 0 && nbEquipement <= 2 : "Le nombre d'�quipements doit �tre entre 0 et 2";

        switch (nbEquipement) {
            case 0:
                equipements[0] = equipement;
                parler("Le soldat " + nom + " s'�quipe avec un " + equipement);
                nbEquipement++;
                break;
            case 1:
                if (equipements[0] == equipement) {
                    parler("Le soldat " + nom + " poss�de d�j� un " + equipement);
                } else {
                    equipements[1] = equipement;
                    parler("Le soldat " + nom + " s'�quipe avec un " + equipement);
                    nbEquipement++;
                }
                break;
            case 2:
                parler("Le soldat " + nom + " est d�j� bien  prot�g� !");
                break;
            default:
            	System.out.println("'�quipements invalide : " + nbEquipement);
        }
    }

	public static void main(String[] args) {
		Romain romain = new Romain("Maximus", 6);

		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.CASQUE);
		romain.sEquiper(Equipement.BOUCLIER);
		romain.sEquiper(Equipement.CASQUE);

	}
}
