package presentation;

import metier.Automobile;
import metier.Scooter;
import service.FabriqueVehicule;
import service.FabriqueVehiculeElectrique;
import service.FabriqueVehiculeEssence;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//on appelle la fabrique
		FabriqueVehicule f1 = new FabriqueVehiculeElectrique();
		FabriqueVehicule f2 = new FabriqueVehiculeEssence();
		
		
		Automobile auto1 = f1.creeAutomobile("mercedes", "grise", 200, 180d);
		Automobile auto2 = f2.creeAutomobile("mercedes", "rose", 100, 150d);
		Scooter scoot1 = f1.creeScooter("peugeot", "verte", 5);
		Scooter scoot2 = f2.creeScooter("V", "rouge", 10);
		
		auto1.afficherCaracteristiques();
		auto2.afficherCaracteristiques();
		scoot1.afficherCaracteristiques();
		scoot2.afficherCaracteristiques();
	}

}
