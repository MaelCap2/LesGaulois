package batailles;

import sites.Village;

import java.util.ArrayList;
import java.util.List;
import personnages.Personnage;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;

public abstract class Batailles {
	private String nom;
	private Village village;
	private Camp camp;
	private List<Gaulois> gaulois;
	private List<Soldat> soldats;
	private int nbGaulois;
	private int nbSoldats;
	
	public Batailles(String n, Village v, Camp c, int nbG, int nbS) {
		this.nom = n;
		this.village = v;
		this.camp = c;
		List<Soldat> gaulois = new ArrayList<>();
		List<Soldat> soldats = new ArrayList<>();
		this.nbGaulois = nbG;
		this.nbSoldats = nbS;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public Village getVillage() {
		return this.village;
	}
	
	public Camp getCamp() {
		return this.camp;
	}
	
	public int getNbGaulois() {
		return this.nbGaulois;
	}
	
	public int getNbSoldats() {
		return this.nbSoldats;
	}
	
	public List<Gaulois> getGaulois() {
		return this.gaulois;
	}
	
	public List<Soldat> getSoldats() {
		return this.soldats;
	}
	
	public Gaulois getGaulois(int i) {
		return this.gaulois.get(i);
	}
	
	public Soldat getSoldats(int i) {
		return this.soldats.get(i);
	}
	
	public void setGaulois(List<Gaulois> g) {
		this.gaulois = g;	
	}
	
	public void setSoldats(List<Soldat> s) {
		this.soldats = s;	
	}
	
	public abstract String decrireContexte();
	public abstract String chosirCombattants(List<Gaulois> g, List<Soldat> s);
	public abstract String preparerCombat();
	public abstract void decrireCombat();
	public abstract String donnerResultat();
	public abstract List<Gaulois> chosirGaulois(int n, Village v);
	public abstract List<Soldat> chosirSoldats(int n, Camp c);
}
