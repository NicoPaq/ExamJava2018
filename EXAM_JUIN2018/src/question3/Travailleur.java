package question3;

public abstract class Travailleur {
	
	public String nom;
	public String prenom;
	public int salaire;
	public int matricule;
	
	public Travailleur(String nom, String prenom, int matricule, int salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
		this.matricule = matricule;
	}
	
	// Non demandé mais une classe abstraite n'étant pas instanciable rien ne nous oblige qu'elle contienne des méthodes abstraites.
	// En revanche, une classe contenant une méthode abstraite doit être déclarée abstraite ! 
	protected void travailleur() {
		System.out.println("Je suis un travailleur");
	}
	
	// Nous n'aurons pas besoin d'une méthode toString(), mise à titre d'information.
	//public String toString() {
		//return "Nom : " + this.nom + "Prenom : " + this.prenom + "Salaire : " + this.salaire + "Matricule : " + this.matricule;
	//}
	
}
