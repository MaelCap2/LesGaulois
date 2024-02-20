package batailles;

public class Conteur {
	private String nom;
	
	public Conteur(String n) {
		this.nom = n;
	}
	
	public void histoire(Batailles b) {
		System.out.println("\nJe suis " + this.nom + ". Je vais vous conter une histoire qui se déroule en 50 avant Jésus-Christ, du temps où la Gaule est occupée par les Romains.\n");
		System.out.println(b.decrireContexte());
		System.out.println(b.chosirCombattants());
		System.out.println(b.preparerCombat());
		System.out.println(b.decrireCombat());
		System.out.println(b.donnerResultat());
	}
}
