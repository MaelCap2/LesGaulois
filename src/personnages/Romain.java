package personnages;

public class Romain {
	
	private String nom;
	private float force;
	
	public Romain(String n, int f) {
		this.nom = n;
		this.force = f;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String t) {
		System.out.println("Le Romain " + getNom() + " : << " + t + " >>.");
	}
	
	public void recevoirCoup(float c) {
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
