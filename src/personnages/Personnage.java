package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String n, int f) {
		this.nom = n;
		this.force = f;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getForce() {
		return this.force;
	}
	
	public void parler(String t) {
		System.out.println(donnerAuteur() + getNom() + " : << " + t + " >>.");
	}
	
	protected abstract String donnerAuteur();
	
	public void recevoirCoup(int c) {
		this.force = this.force - c;
		if(this.force < 0) {
			this.force = 0;
		}
		if(this.force > 0) {
			parler("Aïe !");
		} 
		else {
			parler("J'abandonne...");
		}
	}

}
