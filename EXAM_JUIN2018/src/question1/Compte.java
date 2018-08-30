package question1;

/* 
 * @author NicoPaq
 * */

public class Compte {
	
	// Variable priv�e qui comptera les instances et cr�era les comptes par la m�me occasion.
	private int numero;
	private static int intGenerator = 1;
	// On doit initialiser le solde banquaire � z�ro, on peut le faire dans le constructeur � chaque cr�ation d'un nouveau compte.
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
