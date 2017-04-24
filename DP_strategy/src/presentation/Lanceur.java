package presentation;

import metier.Canard;
import metier.CanardPlastique;
import metier.Colvert;
import metier.Leurre;
import metier.NePasVoler;
import metier.VolerAvecDesAiles;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canard c1 = new Colvert();
		c1.afficher();
		c1.effectuerCancan();
		c1.effectuerVol();
		c1.nager();
		
		Canard c2 = new Leurre();
		c2.afficher();
		c2.effectuerCancan();
		c2.effectuerVol();
		c2.nager();
		
		Canard c3 = new CanardPlastique();
		c3.afficher();
		c3.effectuerCancan();
		c3.effectuerVol();
		c3.nager();
		
		
		//modification du comportement d'un objet sans changer la classe !!!
		c3.setComportementvol(new VolerAvecDesAiles());
		c3.afficher();
		c3.effectuerCancan();
		c3.effectuerVol();
		c3.nager();
		
		
		
	}

}
