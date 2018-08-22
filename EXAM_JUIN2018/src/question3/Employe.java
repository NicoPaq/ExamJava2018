package question3;

public class Employe extends Travailleur {
	
	public Employe(String nom, String prenom, int matricule, int salaire) {
		super(nom, prenom, matricule, salaire);
	}
	
	@Override
	public String toString() {
		return matricule + " - " + nom + " " + prenom;
	}
	
	// Rajout de la méthode getSalaire()
	
	public int getSalaire() {
		return salaire;
	}
	
}
