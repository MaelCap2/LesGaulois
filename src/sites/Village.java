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
	
	public boolean ajouterVillageois(Gaulois g) {
		if (this.nbGaulois == 4) {
			System.out.println("Le gaulois " + getChef().getNom() + " : << Désolé " + g.getNom() + " mon village est déjà bien rempli. >>.");
			return false;
		} else {
			this.gaulois[this.nbGaulois] = g;
			System.out.println("Le gaulois " + getChef().getNom() + " : << Bienvenue " + g.getNom() + " ! >>.");
			this.nbGaulois ++;
			return true;
		}
	}
	
	public void afficherVillageois() {
		System.out.println("Le village de " + getChef().getNom() + " est habité par :");
		for(int i = 0; i < this.nbGaulois; i ++) {
			System.out.println("- " + gaulois[i].getNom());
		}
	}
	
	public void changerChef(Gaulois g) {
		Gaulois gau = new Gaulois(getChef().getNom(), getChef().getForce());
		this.chef = g;
		System.out.println("Le gaulois " + gau.getNom() + " : << Je laisse mon grand bouclier au grand " + getChef().getNom() + " >>.");
		getChef().parler("Merci !");
	}
}
