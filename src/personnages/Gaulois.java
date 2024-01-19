package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	
	public Gaulois(String n, int f) {
		this.nom = n;
		this.force = f;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String t) {
		System.out.println("Le Gaulois " + getNom() + " : << " + t + " >>");
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
	}
}
