package metier;

public class Colvert extends Canard {

	public Colvert() {
		super();
		// on définit un comportement parmi ceux qui existe 
		comportementcancan = new Cancaner1();
		comportementvol = new VolerAvecDesAiles();
	}


	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("je suis un colvert");
		
	}

}
