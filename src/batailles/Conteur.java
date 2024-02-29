package batailles;

public class Conteur {
	private String nom;
	
	public Conteur(String n) {
		this.nom = n;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void histoire(Batailles b) {
		System.out.println("Je suis " + this.getNom() + ". Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ, du temps où la Gaule est occupée par les Romains.\n");
		System.out.println(b.decrireContexte());
		System.out.println(b.chosirCombattants(b.chosirGaulois(b.getNbGaulois(), b.getVillage()), b.chosirSoldats(b.getNbSoldats(), b.getCamp())));
		System.out.println(b.preparerCombat());
		b.decrireCombat();
		System.out.println(b.donnerResultat());
	}
}
