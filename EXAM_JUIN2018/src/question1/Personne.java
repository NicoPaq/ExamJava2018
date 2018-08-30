package question1;

/* 
 * @author NicoPaq
 * */

import java.util.*;

public class Personne {
	
	private String nom;
	private Set<Compte> comptes;
	
	public Personne(String nom) {
		this.nom = nom;
		this.comptes = new HashSet<Compte>();
	}
	
	public void ajouterCompte() {
		Compte current = new Compte(this);
		comptes.add(current);
	}
	
	public String toString() {
		String result;
		result = this.nom + " [ ";
		for (Compte cpt : comptes) {
			result += cpt.getNumero() + " (" + cpt.getSolde() + " EUR) ";
		}
		result += "]";
		return result;
	}

	public int getSolde(Compte cpt) {
		return cpt.getSolde();
	}
	
	public Compte getCompte(int num) {
		for (Compte cpt : comptes) {
			if (cpt.getNumero() == num)
				return cpt;
		}
		return null;
	}
	
	public boolean depot(Compte cpt, int montant) {
		return cpt.ajouter(montant);
	}
	
	public boolean retrait(Compte cpt, int montant) {
		return cpt.retirer(montant);
	}
}
