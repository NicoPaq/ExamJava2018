package question3;

public class Cadre extends Employe {
	
	// Nombre de subordonnés
	private int nombre;
	private String titre;
	
	public Cadre(String titre, String nom, String prenom, int matricule, int salaire ) {
		super(nom, prenom, matricule, salaire);
		this.titre = titre;
	}
	
	public Cadre(String titre, String nom, String prenom, int matricule, int salaire, int nombre ) {
		super(nom, prenom, matricule, salaire);
		this.titre = titre;
		this.nombre = nombre;
	}
	
	public void ajouteSubordonne() {
		nombre++;
	}
	
	@Override
	public String toString() {
		return this.titre + " " + this.matricule + " - " + this.prenom + " " + this.nom + " ("+this.nombre+" subordonnés)";
	}
	
	@Override
	public int getSalaire() {
		return salaire;
	}
}
