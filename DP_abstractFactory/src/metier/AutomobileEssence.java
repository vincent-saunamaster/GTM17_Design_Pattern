package metier;

public class AutomobileEssence extends Automobile {

	public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficherCaracteristiques() {
		// TODO Auto-generated method stub

		System.out.println("Automobile à essence de modèle " + modele + " de couleur " + couleur + " de puissance " + puissance + " et d'espace " + espace);
	}

}
