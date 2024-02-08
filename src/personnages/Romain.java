package personnages;

public class Romain extends Personnage {
	
	public Romain(String n, int f) {
		super(n, f);
	}
	
	protected String donnerAuteur() {
		return "Le romain ";
	}
	
	public void frapper(Personnage p) {
		System.out.println(donnerAuteur() + getNom() + " donne un grand coup de force " + this.getForce() + " au gaulois " + p.getNom() + ".");
		int f = (int) this.getForce() / 3;
		p.recevoirCoup(f);
	}
}
