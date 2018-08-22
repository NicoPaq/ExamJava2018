package question2;

public class Box <T> {
	
	private T object;
	
	// Constructeur par d�faut, pas besoin de lui passer des param�tres
	public Box() {
		this.object = null;
	}
	
	// Un constructeur avec param�tre inconnu - Exemple (non demand� ici)
	// public Box(T val) {
		//this.object = val;
	//}
	
	// M�thode get �quivalente � getValeur by the way.
	// On retourne l'objet dans la bo�te, null si il n'y a rien
	public T get() {
		if(this.object == null) {
			return null;
		}
		return this.object;
	}
	
	// M�thode put �quivalente � setValeur by the way
	// On met un objet dans la bo�te en remplacant l'objet existant le cas �ch�ant.
	public void put(T val) {
		this.object = val;
	}
	
	
}
