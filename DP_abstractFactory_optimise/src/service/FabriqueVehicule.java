package service;

import metier.Automobile;
import metier.Scooter;

public interface FabriqueVehicule {

	Automobile creeAutomobile(String modele, String couleur, int puissance, double espace);
	Scooter creeScooter(String modele, String couleur, int puissance);
}
