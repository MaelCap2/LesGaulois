package personnages;

public class Romain extends Personnage {
	
	public Romain(String n, int f) {
		super(n, f);
	}
	
	protected String donnerAuteur() {
		return "Le romain ";
	}
}
