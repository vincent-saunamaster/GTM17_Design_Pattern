package service;

import metier.Automobile;
import metier.AutomobileElectrique;
import metier.Scooter;
import metier.ScooterElectrique;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Automobile creeAutomobile(String modele, String couleur, int puissance, double espace) {
		// TODO Auto-generated method stub
		
		return new AutomobileElectrique(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		// TODO Auto-generated method stub
		return new ScooterElectrique(modele, couleur, puissance);
	}

}
