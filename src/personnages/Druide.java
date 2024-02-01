package personnages;
import java.util.Random;

public class Druide extends Gaulois{
	private int nbPotions;
	private int puissance;
	
	public Druide(String n, int f, int nb) {
		super(n, f);
		this.nbPotions = nb;
		Random random = new Random();
		this.puissance = random.nextInt(5) + 2;
	}
	
	public int getNbPotions() {
		return this.nbPotions;
	}
	
	public int getPuissance() {
		return this.puissance;
	}
}
