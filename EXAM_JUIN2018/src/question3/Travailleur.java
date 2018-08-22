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
	
	// Non demand� mais une classe abstraite n'�tant pas instanciable rien ne nous oblige qu'elle contienne des m�thodes abstraites.
	// En revanche, une classe contenant une m�thode abstraite doit �tre d�clar�e abstraite ! 
	protected void travailleur() {
		System.out.println("Je suis un travailleur");
	}
	
	// Nous n'aurons pas besoin d'une m�thode toString(), mise � titre d'information.
	//public String toString() {
		//return "Nom : " + this.nom + "Prenom : " + this.prenom + "Salaire : " + this.salaire + "Matricule : " + this.matricule;
	//}
	
}
