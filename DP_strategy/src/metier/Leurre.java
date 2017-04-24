package metier;

public class Leurre extends Canard {

	public Leurre() {
		super();
		// on définit un comportement parmi ceux qui existe
		comportementcancan = new Cancaner2();
		comportementvol = new VolerAvecDesAiles();
	}


	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("je suis un leurre");
		
	}

}
