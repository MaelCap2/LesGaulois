package batailles;

import sites.Village;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import personnages.Personnage;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;

public class Embuscades extends Batailles {
	
	public Embuscades(String n, Village v, Camp c, int nbG, int nbS) {
		super(n, v, c, nbG, nbS);
	}

	public String decrireContexte() {
		String contexte = "Dans une sombre forêt dans un coin reculé de la Gaule, " + this.getNbGaulois() + " comparses se promènent.\n";
		return contexte;
	}

	public String chosirCombattants(List<Gaulois> g, List<Soldat> s) {
		this.setGaulois(g);
		this.setSoldats(s);
		String combattants = "Il s'agit de ";
		for(int i = 0; i < g.size() - 2; i ++) {
			combattants = combattants + g.get(i).getNom() + ", ";
		}
		combattants = combattants + g.get(g.size() - 2).getNom() + " et " + g.get(g.size() - 1).getNom() + ".\nMais cachés derrière des bosquets se cachent ";
		for(int i = 0; i < s.size() - 2; i ++) {
			combattants = combattants + s.get(i).getNom() + ", ";
		}
		combattants = combattants + s.get(s.size() - 2).getNom() + " et " + s.get(s.size() - 1).getNom() + ".\n";
		return combattants;
	}
	
	public String preparerCombat() {
		String preparer = "Les soldats s'étaient bien préparés :\n";
		for(int i = 0; i < this.getSoldats().size(); i ++) {
			preparer = preparer + this.getSoldats(i).equipement(true, true, true);
		}
		return preparer;
	}

	public void decrireCombat() {
		List<Personnage> combattants = new ArrayList();
		for (int i = 0; i < this.getGaulois().size(); i ++) {
			combattants.add(this.getGaulois(i));
		}
		for (int i = 0; i < this.getSoldats().size(); i ++) {
			combattants.add(this.getSoldats(i));
		}
		List<Gaulois> cGaulois = new ArrayList();
		cGaulois = this.getGaulois();
		List<Soldat> cSoldats = new ArrayList();
		cSoldats = this.getSoldats();
		while(!cGaulois.isEmpty() && !cSoldats.isEmpty()) {
			Personnage p = this.choisirFrappeur(combattants);
			if(p instanceof Gaulois) {
				Soldat s = this.choisirSoldat(cSoldats);
				p.frapper(s);
				if (s.getForce() <= 0) {
					combattants.remove(s);
					cSoldats.remove(s);
				}
			} else {
				Gaulois g = this.choisirGaulois(cGaulois);
				p.frapper(g);
				if (g.getForce() <= 0) {
					combattants.remove(g);
					cGaulois.remove(g);
				}
			}
		}
	}

	public String donnerResultat() {
		String nom = "donnerResultat";
		return nom;
	}

	public List<Gaulois> chosirGaulois(int n, Village v) {
		List<Gaulois> selectedElements = new ArrayList<>();
        Random random = new Random();        
        while (selectedElements.size() < n) {
            int randomIndex = random.nextInt(v.getNbGaulois());
            if (!selectedElements.contains(v.getGaulois(randomIndex))) {
                selectedElements.add(v.getGaulois(randomIndex));
            }
        }
        return selectedElements;
	}

	public List<Soldat> chosirSoldats(int n, Camp c) {
		List<Soldat> selectedElements = new ArrayList<>();
        Random random = new Random();        
        while (selectedElements.size() < n) {
            int randomIndex = random.nextInt(c.getNbSoldats());
            if (!selectedElements.contains(c.getSoldats(randomIndex))) {
                selectedElements.add(c.getSoldats(randomIndex));
            }
        }
        return selectedElements;
	}
	
	public Personnage choisirFrappeur(List<Personnage> p) {
		Random random = new Random();
		int randomIndex = random.nextInt(p.size());
		return p.get(randomIndex);
	}
	
	public Gaulois choisirGaulois(List<Gaulois> g) {
		Random random = new Random();
		int randomIndex = random.nextInt(g.size());
		return g.get(randomIndex);
	}
	
	public Soldat choisirSoldat(List<Soldat> s) {
		Random random = new Random();
		int randomIndex = random.nextInt(s.size());
		return s.get(randomIndex);
	}
	
}
