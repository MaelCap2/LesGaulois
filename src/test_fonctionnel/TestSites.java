package test_fonctionnel;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingétorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Minus", 2, Grade.SOLDAT);
		Village village = new Village(vercingétorix);
		Camp camp = new Camp(minus);
		Soldat brutus = new Soldat("Brutus", 5, Grade.CENTURION);
		camp.ajouterSoldat(brutus);
		Soldat milexcus = new Soldat("Milexcus", 2, Grade.SOLDAT);
		camp.ajouterSoldat(milexcus);
		Soldat tullius_octopus = new Soldat("Tullius Octopus", 2, Grade.TESSERARIUS);
		camp.ajouterSoldat(tullius_octopus);
		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3, Grade.OPTIO);
		camp.ajouterSoldat(ballondebaudrus);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		village.ajouterVillageois(agecanonix);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		village.ajouterVillageois(assurancetourix);
		Gaulois asterix = new Gaulois("Astérix", 5);
		village.ajouterVillageois(asterix);
		Gaulois obelix = new Gaulois("Obélix", 15);
		village.ajouterVillageois(obelix);
		Gaulois prolix = new Gaulois("Prolix", 2);
		village.ajouterVillageois(prolix);
		village.afficherVillageois();
		camp.afficherCamp();
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
		Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
		village.changerChef(abraracourcix);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
	}
}
