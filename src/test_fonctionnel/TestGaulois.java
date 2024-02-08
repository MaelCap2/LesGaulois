package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Druide;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 2);
		Gaulois agecanonix = new Gaulois("Agecanonix", 2);
		Soldat minus = new Soldat("Minus", 5, true, true, true, Grade.CENTURION);
		Druide panoramix = new Druide("Panoramix", 1, 3);
		
		asterix.boirePotion(panoramix);
		obelix.boirePotion(panoramix);
		assurancetourix.boirePotion(panoramix);
		abraracourcix.boirePotion(panoramix);
		agecanonix.boirePotion(panoramix);
		
		asterix.parler("Bonjour à tous.");
		minus.parler("UN GAU... UN GAUGAU...");
		
		while(!asterix.finCombat(minus)) {
			asterix.frapper(minus);
			if(!asterix.finCombat(minus)) {
				minus.frapper(asterix);
			}
		}
	}
}
