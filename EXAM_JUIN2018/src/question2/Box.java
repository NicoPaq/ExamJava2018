package question2;

public class Box <T> {
	
	private T object;
	
	// Constructeur par défaut, pas besoin de lui passer des paramètres
	public Box() {
		this.object = null;
	}
	
	// Un constructeur avec paramètre inconnu - Exemple (non demandé ici)
	// public Box(T val) {
		//this.object = val;
	//}
	
	// Méthode get équivalente à getValeur by the way.
	// On retourne l'objet dans la boîte, null si il n'y a rien
	public T get() {
		if(this.object == null) {
			return null;
		}
		return this.object;
	}
	
	// Méthode put équivalente à setValeur by the way
	// On met un objet dans la boîte en remplacant l'objet existant le cas échéant.
	public void put(T val) {
		this.object = val;
	}
	
	
}
