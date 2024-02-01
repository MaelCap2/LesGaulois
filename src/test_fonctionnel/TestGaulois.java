package test_fonctionnel;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		/*Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		for(int i = 0; i < 2; i ++) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
		asterix.frapper(minus);*/
		Druide panoramix = new Druide("Panoramix", 1, 3);
		panoramix.parler("J'ai concocté " + panoramix.getNbPotions() + " doses de potion magique. Elle a une force de " + panoramix.getPuissance() + ".");
	}
}
