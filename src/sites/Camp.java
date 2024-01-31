package sites;

import personnages.Grade;
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
		if (this.nbSoldats == 3) {
			System.out.println("Le romain " + this.commandant.getNom() + " : << Désolé " + s.getNom() + " notre camp est complet ! >>.");
			return false;
		} else {
			this.soldats[this.nbSoldats] = s;
			System.out.println("Le romain " + s.getNom() + " : << Je met mon épée au service de Rome dans le camp dirigé par " + this.commandant.getNom() + " >>.");
			this.nbSoldats ++;
			return true;
		}
	}
	
	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + getCommandant().getNom() + " contient les soldats :");
		for(int i = 0; i < this.nbSoldats; i ++) {
			System.out.println("- " + soldats[i].getNom());
		}
	}
	
	public void changerCommandant(Soldat s) {
		if (s.getGrade() == Grade.CENTURION) {
			Soldat sol = new Soldat(getCommandant().getNom(), getCommandant().getForce(), getCommandant().getGrade());
			this.commandant = s;
			System.out.println("Le romain " + getCommandant().getNom() + " : << Moi " + getCommandant().getNom() + " je prends la direction du camp romain. >>.");
		} else {
			s.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		}
	}
}
