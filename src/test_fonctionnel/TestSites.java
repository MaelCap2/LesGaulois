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
		
	}
}
