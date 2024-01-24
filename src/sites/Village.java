package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] gaulois = new Gaulois[50];
	private int nbGaulois;
	
	public Village(Gaulois c) {
		this.chef = c;
		c.parler("Je suis un grand guerrier et je vais créer mon village");
	}
	
	public Gaulois getChef() {
		return this.chef;
	}
	
	public boolean ajouterSoldat(Gaulois g) {
		if (this.nbGaulois == 50) {
			return false;
		} else {
			this.gaulois[this.nbGaulois] = g;
			return true;
		}
	}
}
