package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats = new Soldat[80];
	private int nbSoldats;
	
	public Camp(Soldat c) {
		this.commandant = c;
		c.parler("Je suis en charge de créer un nouveau camp romain");
	}
	
	public Soldat getCommandant() {
		return this.commandant;
	}
	
	
	
	public boolean ajouterSoldat(Soldat s) {
		if (this.nbSoldats == 80) {
			System.out.println("Le romain " + this.commandant.getNom() + " : << Désolé " + s.getNom() + " notre camp est complet ! >>.");
			return false;
		} else {
			this.soldats[this.nbSoldats] = s;
			System.out.println("Le romain " + s.getNom() + " : << Je met mon épée au service de Rome dans le camp dirigé par " + this.commandant.getNom() + " >>.");
			return true;
		}
	}
}
