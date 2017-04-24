package metier;

public abstract class DecoratorIngredients extends Boisson {

	//objet mère
	protected Boisson boisson;

	// constructeur particulier qui prend en parametre son objet mère
	public DecoratorIngredients(Boisson boisson) {
		this.boisson = boisson;
	}

	public abstract String getDescription();
	

}
