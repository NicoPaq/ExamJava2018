package question2;

/* 
 * @author NicoPaq
 * */

public class Box <T> {
	
	private T object;
	
	// Constructeur par défaut, pas besoin de lui passer des paramètres
	public Box() {
		this.object = null;
	}
	
	// Méthode get équivalente à getValeur by the way.
	// On retourne l'objet dans la boîte, null si il n'y a rien
	public T get() {
		// Pas traitement spécifique.
		return this.object;
	}
	
	// Méthode put équivalente à setValeur by the way pour mettre un élément dans la boîte.
	// On met un objet dans la boîte en remplacant l'objet existant le cas échéant.
	public void put(T val) {
		this.object = val;
	}
	
	
}
