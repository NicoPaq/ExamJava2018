package question1;

/* 
 * @author NicoPaq
 * */

public class Compte {
	
	// Variable privée qui comptera les instances et créera les comptes par la même occasion.
	private int numero;
	private static int intGenerator = 1;
	// On doit initialiser le solde banquaire à zéro, on peut le faire dans le constructeur à chaque création d'un nouveau compte.
	private int solde;
	private Personne titulaire;
	
	public Compte (Personne titulaire) {
		this.solde = 0;
		this.numero = intGenerator++;
		this.titulaire = titulaire;
	}

	public boolean ajouter(int montant) {
		if(montant > 0) {
			solde += montant;
			return true;
		}
		return false;
	}
	
	public boolean retirer(int montant) {
		if(montant > 0 && solde - montant > 0) {
			solde -= montant;
			return true;
		}
		return false;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public Personne getTitulaire(){
		return this.titulaire;
	}
	
	public String toString() {
		return numero + " ("+solde+" EUR)";
	}
}
