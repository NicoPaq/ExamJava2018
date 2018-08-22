package question3;

public class Commercial extends Employe {

	private int nombreVentes;
	
	public Commercial(String nom, String prenom, int matricule, int salaire) {
		super(nom, prenom, matricule, salaire);
		nombreVentes = 0;
	}
	
	public void ajouteVente() {
		nombreVentes++;
	}
	
	public void razVente() {
		nombreVentes = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " [" + nombreVentes + " vente(s) ce mois]";
	}
	
	@Override
	public int getSalaire() {
		int bonus = nombreVentes * 100;
		return salaire + bonus;
	}
	
}