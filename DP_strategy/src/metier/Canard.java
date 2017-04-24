package metier;

public abstract class Canard {

	// les interfaces des comportements
	protected ComportementVoler comportementvol;
	protected ComportementCancaner comportementcancan;

	//les méthodes qui pourront avoir différents comportements
	public void effectuerCancan(){
		comportementcancan.Cancaner();
	}
	
	public void effectuerVol(){
		comportementvol.voler();
	}
	
	public void nager(){
		System.out.println("je nage");
	}
	
	// les getter et setters qui vont permettre de changer dynamiquement le comportement de l'objet
	public ComportementVoler getComportementvol() {
		return comportementvol;
	}

	public void setComportementvol(ComportementVoler comportementvol) {
		this.comportementvol = comportementvol;
	}

	public ComportementCancaner getComportementcancan() {
		return comportementcancan;
	}

	public void setComportementcancan(ComportementCancaner comportementcancan) {
		this.comportementcancan = comportementcancan;
	}

	// méthode à définir dans classes filles
	public abstract void afficher();
}
