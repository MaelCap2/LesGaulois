package batailles;

import sites.Village;

import java.util.List;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;

public abstract class Batailles {
	private String nom;
	private Village village;
	private Camp camp;
	
	public Batailles(String n, Village v, Camp c) {
		this.nom = n;
		this.village = v;
		this.camp = c;
	}
	
	public abstract String decrireContexte();
	public abstract String chosirCombattants(List<Gaulois> g, List<Soldat> s);
	public abstract String preparerCombat();
	public abstract String decrireCombat();
	public abstract String donnerResultat();
}
