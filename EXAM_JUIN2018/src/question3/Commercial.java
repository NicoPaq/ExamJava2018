package question3;

/* 
 * @author NicoPaq
 * */

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
		return salaire + (nombreVentes * 100);
	}
	
}