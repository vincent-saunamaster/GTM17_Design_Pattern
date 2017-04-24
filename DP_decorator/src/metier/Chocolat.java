package metier;

public class Chocolat extends DecoratorIngredients {

	public Chocolat(Boisson boisson) {
		super(boisson);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return boisson.getDescription()+", Chocolat";
	}

	@Override
	public double calculCout() {
		// TODO Auto-generated method stub
		return 0.2d+boisson.calculCout();
	}

}
