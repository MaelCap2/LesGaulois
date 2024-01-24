package personnages;

public class Gaulois extends Personnage{
	
	public Gaulois(String n, int f) {
		super(n, f);
	}
	
	protected String donnerAuteur() {
		return "Le  ";
	}
}