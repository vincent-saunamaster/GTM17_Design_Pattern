package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Chocolat;
import metier.Columbia;
import metier.Espresso;

public class ApplicationDecorateur {
	public static void main(String[] args) {

		Boisson b1 = new Espresso();
		Boisson b2 = new Columbia();
		// avec ajout des fonctionnalités (ingrédients optionnels)
		Boisson b3 = new Espresso();
		b3 = new Chocolat(b3);
		b3 = new Caramel(b3);
		
		// ça marche aussi
		Boisson b4 = new Caramel(new Columbia());

		System.out.println(b1.getDescription() + " : " + b1.calculCout() + "euros");
		System.out.println(b2.getDescription() + " : " + b2.calculCout() + "euros");
		System.out.println(b3.getDescription() + " : " + b3.calculCout() + "euros");
		System.out.println(b4.getDescription() + " : " + b4.calculCout() + "euros");

	}
}
