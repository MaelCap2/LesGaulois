package personnages;

public abstract class Personnage {
	private String nom;
	private double force;
	
	public Personnage(String n, double f) {
		this.nom = n;
		this.force = f;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public double getForce() {
		return this.force;
	}
	
	public void setForce(double f) {
		this.force = f;
	}
	
	public void parler(String t) {
		System.out.println(donnerAuteur() + getNom() + " : << " + t + " >>.\n");
	}
	
	public abstract void frapper(Personnage p);
	
	protected abstract String donnerAuteur();
	
	public abstract void recevoirCoup(double c);
}
