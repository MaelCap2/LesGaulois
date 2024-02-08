package personnages;

public class Gaulois extends Personnage {
	private double newForce;
	private float potion;
	
	public Gaulois(String n, double f) {
		super(n, f);
		this.potion = 1;
		this.newForce = this.potion * this.getForce();
	}
	
	public float getPotion() {
		return this.potion;
	}
	
	public void setPotion(float x) {
		this.potion = x;
	}
	
	public double getNewForce() {
		return this.newForce;
	}
	
	public void setNewForce(double x) {
		this.newForce = x;
	}
	
	protected String donnerAuteur() {
		return "Le gaulois ";
	}
	
	public void boirePotion(Druide druide) {
		if(druide.getNbPotions() > 0) {
			if(!this.getNom().equals("Obélix")) {
				druide.parler("Tiens " + this.getNom() + " un peu de potion magique.");
				druide.setNbPotions(druide.getNbPotions() - 1);
				this.potion = druide.getPuissance();
			} else {
				druide.parler("Non, " + this.getNom() + " Non !... Et tu le sais très bien !");
			}
		} else {
			druide.parler("Désolé " + this.getNom() + " il n'y a plus une seule goute de potion.");
		}
	}
	
	public boolean finCombat(Personnage p) {
		if(this.getForce() <= 0 || p.getForce() <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void frapper(Romain p) {
		this.setNewForce(this.getPotion() * this.getForce());
		System.out.println(donnerAuteur() + getNom() + " donne un grand coup de force " + this.getNewForce() + " au romain " + p.getNom() + ".");
		p.recevoirCoup(this.getNewForce());
		if(this.getPotion() > 1) {
			this.potion = this.getPotion() - 1/2;
		}
	}
	
	public void recevoirCoup(double c) {
		double f = c / this.getPotion();
		this.setForce(this.getForce() - f);
		if(this.getForce() < 0) {
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