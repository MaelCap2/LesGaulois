package personnages;

public class Soldat extends Romain{
	private Grade grade;
	
	public Soldat(String n, double f, boolean casque, boolean plastron, boolean bouclier, Grade g) {
		super(n, f, casque, plastron, bouclier);
		this.grade = g;
	}
	
	public Grade getGrade() {
		return this.grade;
	}
}
