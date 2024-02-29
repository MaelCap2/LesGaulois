package personnages;

public class Romain extends Personnage {
	private boolean[] equipement;
	
	public Romain(String n, double f) {
		super(n, f);
		this.equipement = new boolean[3];
	}
	
	public String equipement(boolean casque, boolean plastron, boolean bouclier) {
		this.equipement[0] = casque;
		String texte = "";
		if(this.equipement[0] == true) {
			texte = texte + "- Le soldat " + this.getNom() + " s'équipe avec un casque.\n";
		}
		this.equipement[1] = plastron;
		if(this.equipement[1] == true) {
			texte = texte + "- Le soldat " + this.getNom() + " s'équipe avec un plastron.\n";
		}
		this.equipement[2] = bouclier;
		if(this.equipement[2] == true) {
			texte = texte + "- Le soldat " + this.getNom() + " s'équipe avec un bouclier.\n";
		}
		return texte;
	}
	
	public boolean getEquipement(int i) {
		return this.equipement[i];
	}
	
	protected String donnerAuteur() {
		return "Le romain ";
	}
	
	public void frapper(Personnage p) {
		System.out.println(donnerAuteur() + getNom() + " donne un grand coup de force " + this.getForce() + " au gaulois " + p.getNom() + ".");
		p.recevoirCoup(this.getForce());
	}
	
	public void recevoirCoup(double c) {
		if(this.getEquipement(0)) {
			c = c - 2;
			System.out.println("Le casque absorbe 2 du coup.");
		}
		if(this.getEquipement(1)) {
			c = c - 3;
			System.out.println("Le plastron absorbe 3 du coup.");
		}
		if(this.getEquipement(2)) {
			c = c - 3;
			System.out.println("Le bouclier absorbe 3 du coup.");
		}
		if(c < 0) {
			c = 0;
		}
		this.setForce(this.getForce() - c);
		if (this.getForce() < 0) {
			this.setForce(0);
		}
		if(this.getForce() > 0) {
			parler("Aïe !");
		} 
		else {
			parler("J'abandonne...");
		}
	}
}
