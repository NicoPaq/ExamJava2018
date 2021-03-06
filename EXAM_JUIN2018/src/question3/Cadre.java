package question3;

/* 
 * @author NicoPaq
 * */

public class Cadre extends Employe {
	
	// Nombre de subordonnÚs
	private int nbSubordonnes = 0;
	private String titre;
	
	public Cadre(String titre, String nom, String prenom, int matricule, int salaire ) {
		super(nom, prenom, matricule, salaire);
		this.titre = titre;
	}
	
	public Cadre(String titre, String nom, String prenom, int matricule, int salaire, int nombre ) {
		// Appel Ó l'autre constructeur de la classe puis rajout des subordonnÚs.
		this(titre,nom, prenom, matricule, salaire);
		this.nbSubordonnes = nombre;
	}
	
	public void ajouteSubordonne() {
		nbSubordonnes++;
	}
	
	@Override
	public String toString() {
		return this.titre + " " + this.matricule + " - " + this.prenom + " " + this.nom + " ("+this.nbSubordonnes+" subordonnÚs)";
	}
}
