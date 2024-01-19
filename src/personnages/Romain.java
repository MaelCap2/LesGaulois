package personnages;

public class Romain {
	
	private String nom;
	private int force;
	
	public Romain(String n, int f) {
		this.nom = n;
		this.force = f;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String t) {
		System.out.println("Le Romain " + getNom() + " : << " + t + " >>");
	}
}
