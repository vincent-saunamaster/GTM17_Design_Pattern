package metier;

public class Caramel extends DecoratorIngredients {

	public Caramel(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+", Caramel";
	}

	@Override
	public double calculCout() {
		// TODO Auto-generated method stub
		return 0.22d+boisson.calculCout();
	}

}
