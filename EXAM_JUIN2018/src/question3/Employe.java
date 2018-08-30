package question3;

/* 
 * @author NicoPaq
 * */

public class Employe extends Travailleur {
	
	public Employe(String nom, String prenom, int matricule, int salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.matricule = matricule;
		this.salaire = salaire;
	}
	
	public String toString() {
		return matricule + " - " + nom + " " + prenom;
	}
	
}
