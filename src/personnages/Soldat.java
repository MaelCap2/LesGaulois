package personnages;

public class Soldat extends Romain{
	private Grade grade;
	
	public Soldat(String n, double f, Grade g) {
		super(n, f);
		this.grade = g;
	}
	
	public Grade getGrade() {
		return this.grade;
	}
}
