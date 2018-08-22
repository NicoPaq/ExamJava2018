package question1;

public class Compte {
	
	// Variable privée qui comptera les instances et créera les comptes par la même occasion.
	private static int numero;
	private static int intGenerator = 1;
	// On doit initialiser le solde banquaire à zéro, on peut le faire dans le constructeur à chaque création d'un nouveau compte.
	private static int solde;
	private Personne titulaire;
	
	public Compte (Personne titulaire) {
		this.titulaire = titulaire;
		solde = 0;
		numero = intGenerator++;
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
	
	public static int getSolde() {
		return solde;
	}
	
	public static int getNumero() {
		return numero;
	}
	
	public Personne getTitulaire(){
		return this.titulaire;
	}
	
	public String toString() {
		return numero + " ("+solde+" EUR)";
	}
}
