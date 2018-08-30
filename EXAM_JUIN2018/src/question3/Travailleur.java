package question3;

/* 
 * @author NicoPaq
 * */

public abstract class Travailleur {
	
	// Permettre l'acc�s des sous classes aux champs => protected
	protected String nom;
	protected String prenom;
	protected int salaire;
	protected int matricule;
	
	// Pas de constructeur n�cessaire.
	
	public int getSalaire() {
		return salaire;
	}
	
	// Nous n'aurons pas besoin d'une m�thode toString(), mise � titre d'information.
	//public String toString() {
		//return "Nom : " + this.nom + "Prenom : " + this.prenom + "Salaire : " + this.salaire + "Matricule : " + this.matricule;
	//}
	
}
