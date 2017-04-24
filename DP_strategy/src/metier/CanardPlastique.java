package metier;

public class CanardPlastique extends Canard {

	public CanardPlastique() {
		super();
		// on définit un comportement parmi ceux qui existe
		comportementcancan = new Cancaner0();
		comportementvol = new NePasVoler();
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("je suis un Canard en plastique");

	}

}
