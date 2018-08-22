package question1;
import java.util.*;

public class Personne {
	
	private String nom;
	private Map <Integer, Integer> comptes;
	
	public Personne(String nom) {
		this.nom = nom;
		// Initialiser la liste des comptes vides => On fait appel aux collections => Je pense à une collection de type Map.
		// Si on avait déclaré privé le Map en dehors du contructeur il aurait été local au constructeur. Ce n'est pas ce qu'on veut sans quoi pas initialisé.
		comptes = new TreeMap <Integer, Integer>();
	}
	
	public void ajouterCompte(Compte compte) {
		comptes.put(compte.getNumero(), compte.getSolde());
	}
	
	public String toString() {
		if(comptes.isEmpty() == false) {
			String result;
			result = this.nom + " [ ";
			for (Map.Entry<Integer, Integer> entry : comptes.entrySet()) {
				result += entry.getKey() + " (" + entry.getValue() + " EUR) ";
			}
			result += "]";
			return result; 
		}
		return this.nom + " [ ]";
	}
}
