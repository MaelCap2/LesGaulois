package personnages;

public class Gaulois extends Personnage {
	private float newForce;
	private float potion;
	
	public Gaulois(String n, int f) {
		super(n, f);
		System.out.println(this.getForce());
		this.potion = 1;
		this.newForce = this.potion * this.getForce();
	}
	
	public float getPotion() {
		return this.potion;
	}
	
	public void setPotion(float x) {
		this.potion = x;
	}
	
	public float getNewForce() {
		return this.newForce;
	}
	
	public void setNewForce(float x) {
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
				this.newForce = this.getForce() * this.getPotion();
			} else {
				druide.parler("Non, " + this.getNom() + " Non !... Et tu le sais très bien !");
			}
		} else {
			druide.parler("Désolé " + this.getNom() + " il n'y a plus une seule goute de potion.");
		}
		System.out.println(this.getNewForce());
	}
	
	public boolean finCombat(Personnage p) {
		if(this.getForce() <= 0 || p.getForce() <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void frapper(Romain p) {
		System.out.println(donnerAuteur() + getNom() + " donne un grand coup de force " + this.getNewForce() / 3 + " au romain " + p.getNom() + ".");
		int f = (int) (this.getForce() * this.newForce / 3);
		p.recevoirCoup(f);
		this.potion = this.getPotion() - 1/2;
	}
}