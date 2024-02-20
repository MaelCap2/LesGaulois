package batailles;

import sites.Village;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;

public class Embuscades extends Batailles {
	
	public Embuscades(String n, Village v, Camp c) {
		super(n, v, c);
	}

	public String decrireContexte() {
		String contexte = "Dans une sombre forêt dans un coin reculé de la Gaule, quatre comparses se promènent.\n";
		return contexte;
	}

	public String chosirCombattants(List<Gaulois> g, List<Soldat> s) {
		String combattants = "Il s'agit de ";
		for(int i = 0; i < g.size() - 2; i ++) {
			combattants = combattants + g.get(i) + ", ";
		}
		combattants = combattants + g.get(g.size() - 2) + " et " + g.get(g.size() - 1) + ".\nMais cachés derrière des bosquets se cachent ";
		for(int i = 0; i < s.size() - 2; i ++) {
			combattants = combattants + s.get(i) + ", ";
		}
		combattants = combattants + s.get(s.size() - 2) + " et " + s.get(s.size() - 1) + ".";
		return combattants;
	}
	
	public String preparerCombat() {
		String nom = "preparerCombat";
		return nom;
	}

	public String decrireCombat() {
		String nom = "decrireCombat";
		return nom;
	}

	public String donnerResultat() {
		String nom = "donnerResultat";
		return nom;
	}
	
	public List<Gaulois> choisirGaulois(int n, Village v){
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
	
	public List<Soldat> choisirSoldats(int n, Camp v){
        List<Soldat> selectedElements = new ArrayList<>();
        Random random = new Random();        
        while (selectedElements.size() < n) {
            int randomIndex = random.nextInt(v.getNbSoldats());
            if (!selectedElements.contains(v.getSoldats(randomIndex))) {
                selectedElements.add(v.getSoldats(randomIndex));
            }
        }
        return selectedElements;
	}
	
}
