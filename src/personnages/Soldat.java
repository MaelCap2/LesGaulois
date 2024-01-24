package personnages;

public class Soldat extends Romain{
	private Grade grade;
	
	public Soldat(String n, int f, Grade g) {
		super(n, f);
		this.grade = g;
	}
	

}
